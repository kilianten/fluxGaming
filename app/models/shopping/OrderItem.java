package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.products.*;
import models.users.*;

@Entity
public class OrderItem extends Model {

    @Id
    private Long id;
    
    @ManyToOne
    private Basket basket;

    @ManyToOne
    private Product product;
    
    private int quantity;
    private double price;

    // Default constructor
    public  OrderItem() {
    }
    
    public OrderItem(Product p) {
            product = p;
            quantity = 1;
            price = p.getPrice();
    }
    public void increaseQty() {
           quantity += 1;
    }
    public void decreaseQty() {
        quantity -= 1;
    }
    
    public double getItemTotal() {
        return this.price * this.quantity;
    }
	
    public static Finder<Long,OrderItem> find = new Finder<Long,OrderItem>(OrderItem.class);

    public static List<OrderItem> findAll() {
        return OrderItem.find.all();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}