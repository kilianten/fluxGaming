package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.shopping.Basket;


@Entity
@DiscriminatorValue("mod")
public class Moderator extends User{

    public Moderator(String name, String role, String password, String email, Basket basket){
        super(name, role, email, password, basket);
    }

    public static List<User> findAll(){
        return find.query().where().eq("role", "mod").findList();
    }

}