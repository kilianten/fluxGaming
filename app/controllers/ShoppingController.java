package controllers;

import play.mvc.*;
import play.data.*;
import javax.inject.Inject;

import views.html.*;
import play.db.ebean.Transactional;
import play.api.Environment;

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