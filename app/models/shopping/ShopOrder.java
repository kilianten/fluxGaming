package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.util.Calendar;

import models.products.*;
import models.users.Login;
import models.users.Register;
import models.User;

// ShopOrder entity managed by Ebean
@Entity
public class ShopOrder extends Model {

    @Id
    private Long id;
    
    private Calendar OrderDate;
    
    // Order contains may items.
    // mappedBy makes this side of the mapping the owner
    // so foreign key will be placed in resulting OrderItem table
    // All changes, including deletes will be cascaded
    @OneToMany(mappedBy="shopOrder", cascade = CascadeType.ALL)
    private List<OrderItem> items;
    
    @ManyToOne
    private User user;

    // Default constructor
    public  ShopOrder() {
        OrderDate = Calendar.getInstance();
    }
    public double getOrderTotal() {
        
        double total = 0;
        
        for (OrderItem i: items) {
            total += i.getItemTotal();
        }
        return total;
    }
	
	//Generic query helper
    public static Finder<Long,ShopOrder> find = new Finder<Long,ShopOrder>(ShopOrder.class);

    //Find all Products in the database
    public static List<ShopOrder> findAll() {
        return ShopOrder.find.all();
    }

    public void removeAllItems() {
        for (OrderItem i : items) {
            Product p = Product.find.byId(i.getProduct().getId());
            if (i.getProduct().getId() == p.getId()) {
                int quantity = i.getQuantity();
                p.incrementStock(quantity);
                p.update();
            }
        }

        for(OrderItem i: this.items) {
            i.delete();
        }
        this.items = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Calendar orderDate) {
        OrderDate = orderDate;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    } 

}