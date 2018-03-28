package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class User extends Model {

    @Id
    private String username;
    private String role;
    private String email;
    private String password;

    public User(String username, String role, String email, String password) {
        this.username = username;
        this.role = role;
        this.email = email;
        this.password = password;
    }

    public static Finder<String, User> find = new Finder<String, User>(User.class);

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static List<User> findAll(){
        return User.find.all();
    }

    public static User authenticate(String username, String password){
        return find.query().where().eq("username", username).eq("password", password).findUnique();
    }

    public static User getUserById(String username){
        if (username == null)
          {
            return null;
          }
        else
          {
            return find.byId(username);
          }
        }

    public static Map<String, String> listAdmins() {

        List<User> admins = find.query().where().eq("role", "admin").findList();

        LinkedHashMap<String, String> adminsMap = new LinkedHashMap();

        for(User u: admins){
            adminsMap.put(u.getUsername(), u.getUsername());
        }
        return adminsMap;
    }

}