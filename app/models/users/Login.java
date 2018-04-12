package models.users;

import models.User;

public class Login{

    private String username;
    private String password;

    public String validate(){
        if(User.authenticate(getUsername(), getPassword()) == null){
            return "Invalid user or password";
        }
        return null;
    }


public String getUsername(){
    return username;
}

public void setUsername(String username){
    this.username = username;
}

public String getPassword(){
    return password;
}

public void setPassword(String password){
    this.password = password;
}

}