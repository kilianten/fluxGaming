package controllers;

import play.mvc.*;
import play.data.*;
import javax.inject.Inject;

import views.html.*;
import play.db.ebean.Transactional;
import play.api.Environment;
import java.util.List;

import models.users.*;
import models.*;
import models.products.*;
import models.shopping.*;

@Security.Authenticated(SecuredShop.class)
public class ShoppingController extends Controller {

    private FormFactory formFactory;

    private Environment env;

    @Inject
    public ShoppingController(Environment e, FormFactory f) {
        this.env = e;
        this.formFactory = f;
    }

    public Form<Login> getLogin(){
        return formFactory.form(Login.class);
    }

    public User getUser(){
        return User.getUserById(session().get("username"));
    }

    public Result addToCart(Long id){

        Product p = Product.find.byId(id);

        User customer = getUser();
        

        if(p.getStock() > 0){
            if(customer.getBasket() == null){
                customer.setBasket(new Basket());
                customer.getBasket().setUser(customer);
                customer.update();
            }
            customer.getBasket().addProduct(p);
            customer.update();

            p.decrementStock();
            p.update();

            } else { //out of stock
                flash("error", "Sorry item is out of stock");
            }
        return redirect(routes.HomeController.store());
    }

    @Transactional
    public Result placeOrder() {
        User u = getUser();
        
        // Create an order instance
        ShopOrder order = new ShopOrder();
        
        // Associate order with customer
        order.setUser(u);
        
        // Copy basket to order
        order.setItems(u.getBasket().getBasketItems());
        
        // Save the order now to generate a new id for this order
        order.save();
       
       // Move items from basket to order
        for (OrderItem i: order.getItems()) {
            // Associate with order
            i.setOrder(order);
            // Remove from basket
            i.setBasket(null);
            // update item
            i.update();
        }
        
        // Update the order
        order.update();
        
        // Clear and update the shopping basket
        u.getBasket().setBasketItems(null);
        u.getBasket().update();
        
        // Show order confirmed view
        return ok(orderConfirmed.render(u, order, getLogin()));
    }

    public Result viewOrders(){

        List<ShopOrder> orderList;
        orderList = ShopOrder.findAll();

        return ok(viewOrders.render(getUser(), getLogin(), orderList));
    }


    @Transactional
    public Result emptyBasket() {

        User customer = getUser();

        customer.getBasket().removeAllItems();
        customer.getBasket().update();
            
        return redirect(routes.HomeController.store());
        
    }

    @Transactional
    public Result addOne(Long itemId) {
       
        OrderItem item = OrderItem.find.byId(itemId);
        
            if(item.getProduct().getStock()>0){

            item.increaseQty();
            
            item.getProduct().decrementStock();
            item.getProduct().update();

            item.update();
            
            }
            else
            {
                flash("error", "Sorry, no more of these products left");
            }

            return redirect(routes.HomeController.basket());
        }

    @Transactional
    public Result removeOne(Long itemId) {
        
        OrderItem item = OrderItem.find.byId(itemId);
        
        User customer = getUser();
        
        customer.getBasket().removeItem(item);
        customer.getBasket().update();

        item.getProduct().incrementStock(1);
        item.getProduct().update();

        if(customer.getBasket().getBasketItems().size() == 0){
            return redirect(routes.HomeController.store());
        }
        
        return redirect(routes.HomeController.basket());
    }
        

    


}