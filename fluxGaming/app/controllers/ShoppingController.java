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

    public Result addToCart(Long id){

        Product p = Product.find.byId(id);

        User customer = User.getUserById(session().get("username"));
        

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

        

    


}