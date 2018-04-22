package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.util.Calendar;

import java.text.SimpleDateFormat;
import java.text.DateFormat;

import models.products.*;
import models.User;

import java.util.HashMap;
import java.util.Map;

@Entity
public class ShopOrder extends Model {

    @Id
    private Long id;
    
    private Date orderDate;
    
    @OneToMany(mappedBy="shopOrder", cascade = CascadeType.ALL)
    private List<OrderItem> items;
    
    @ManyToOne
    private User user;

    public  ShopOrder() {
        orderDate = new Date();
    }

    public double getOrderTotal() {
        
        double total = 0;
        
        for (OrderItem i: items) {
            total += i.getItemTotal();
        }
        return total;
    }
	
    public static Finder<Long,ShopOrder> find = new Finder<Long,ShopOrder>(ShopOrder.class);

    public static List<ShopOrder> findAll() {
        return ShopOrder.find.all();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderDate() {
        return new SimpleDateFormat("dd-MM-yyyy").format(orderDate);
    }

    public void setOrderDate(Calendar orderDate) {
        
        orderDate = orderDate;
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

    public static Map<String, Integer> getMonth(int year){

        String years = Integer.toString(year);

        Map<String, Integer> orderMap = new HashMap<String, Integer>();

        List<ShopOrder> orders = ShopOrder.find.query().where().like("orderDate", "%" + years + "%").findList();
        
        
        for(ShopOrder o: orders){
            for(OrderItem i: o.getItems()){
                if(orderMap.containsKey(i.getProduct().getName())){
                    orderMap.put(i.getProduct().getName(), (orderMap.get(i.getProduct().getName()) + i.getQuantity()));
                } else {
                orderMap.put(i.getProduct().getName(), i.getQuantity());
                }
            }
        }

        return orderMap;

    }

    public static List<Integer> options() {

        ArrayList<Integer> years = new ArrayList<Integer>();
        int baseYear = 2015;
        int currentYear = Calendar.getInstance().get(1);
        
        while(currentYear >= baseYear){
            years.add(currentYear);
            currentYear--;
        }

        return years;
    }

}