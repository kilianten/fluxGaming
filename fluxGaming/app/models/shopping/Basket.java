package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.users.*;
import models.products.*;
import models.*;

@Entity
public class Basket extends Model {

    @Id
    private Long id;
    
    @OneToMany(mappedBy = "basket", cascade = CascadeType.PERSIST)
    private List<OrderItem> basketItems;
    
    @OneToOne
    private User user;

    public  Basket() {
    }

    public void addProduct(Product p) {
        
        boolean itemFound = false;

        for (OrderItem i : basketItems) {
            if (i.getProduct().getId() == p.getId()) {
                i.increaseQty();
                itemFound = true;
                break;
            }
        }
        if (itemFound == false) {
            
            OrderItem newItem = new OrderItem(p);
            
            basketItems.add(newItem);
        }
    }
    public void removeItem(OrderItem item) {

        for (Iterator<OrderItem> iter = basketItems.iterator(); iter.hasNext();) {
            OrderItem i = iter.next();
            if (i.getId().equals(item.getId()))
            {
                if (i.getQuantity() > 1 ) {
                    i.decreaseQty();
                }

                else {
                    
                    i.delete();
                    
                    iter.remove();
                    break;
                }             
            }
		}
    }
    public void removeAllItems() {
        for (OrderItem i : basketItems) {
            Product p = Product.find.byId(i.getProduct().getId());
            if (i.getProduct().getId() == p.getId()) {
                int quantity = i.getQuantity();
                p.incrementStock(quantity);
                p.update();
            }
        }

        for(OrderItem i: this.basketItems) {
            i.delete();
           }
            this.basketItems = null;
    }
    public double getBasketTotal() {
        
        double total = 0;
        
        for (OrderItem i: basketItems) {
            total += i.getItemTotal();
        }
        return total;
    }

    public static Finder<Long,Basket> find = new Finder<Long,Basket>(Basket.class);

    public static List<Basket> findAll() {
        return Basket.find.all();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<OrderItem> getBasketItems() {
        return basketItems;
    }

    public void setBasketItems(List<OrderItem> basketItems) {
        this.basketItems = basketItems;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getCount(){
        int count = 0;

        for (OrderItem i : basketItems) {
            Product p = Product.find.byId(i.getProduct().getId());
            if (i.getProduct().getId() == p.getId()) {
                count += i.getQuantity();
            }
        }
        return count;
    }
}