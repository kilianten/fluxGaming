package models.users;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.User;

public class Register {

    @Constraints.Required
    private String username;
    @Constraints.Required
    private String email;
    @Constraints.Required
    private String confirmPassword;
    @Constraints.Required
    private String password;

    public String validate(){
        if(!getConfirmPassword().equals(getPassword())){
            return "Passwords do not match";
        }
        if(User.isUsernameTaken(getUsername())){
            return "Username is already taken";
        }
        if(User.isEmailTaken(getEmail())){
            return "Email is already taken";
        }
        if(!getEmail().contains("@")){
            return "Please enter a valid email";
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

public String getConfirmPassword(){
    return confirmPassword;
}

public void setConfirmPassword(String confirmPassword){
    this.confirmPassword = confirmPassword;
}

public String getEmail(){
    return email;
}

public void setEmail(String email){
    this.email=email;
}

}