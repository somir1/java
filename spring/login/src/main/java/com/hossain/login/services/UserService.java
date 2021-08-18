package com.hossain.login.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.hossain.login.models.LoginUser;
import com.hossain.login.models.User;
import com.hossain.login.repositories.UserRepo;
    
@Service
public class UserService {
    
    @Autowired
    private UserRepo userRepo;
    
    public User getUserById(Long id) {
    	return this.userRepo.findById(id).orElse(null);
    }
    
    //this is a service method and we name it register
    //validations for the user
    public User register(User newUser, BindingResult result) {
    	//this validation is to make sure the email is in the correct format or one that does not exist
        if(userRepo.findByEmail(newUser.getEmail()).isPresent()) {
            result.rejectValue("email", "Unique", "This email is already in use!");
        }
        // checking if the confirmed password is matched to the one entered 
        if(!newUser.getPassword().equals(newUser.getConfirm())) {
            result.rejectValue("confirm", "Matches", "The Confirm Password must match Password!");
        }
        if(result.hasErrors()) {
            return null;
        } //if validations are met this will use bcrypt to hash the new password rom the form 
        else {
            String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
            newUser.setPassword(hashed);
            return userRepo.save(newUser);
        }
    }
    
    public User login(LoginUser newLogin, BindingResult result) {
        if(result.hasErrors()) {
            return null;
        }
        Optional<User> potentialUser = userRepo.findByEmail(newLogin.getEmail());
        if(!potentialUser.isPresent()) {
            result.rejectValue("email", "Unique", "Unknown email!");
            return null;
        }
        User user = potentialUser.get();
        if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
            result.rejectValue("password", "Matches", "Invalid Password!");
        }
        if(result.hasErrors()) {
            return null;
        } else {
            return user;
        }
    }
    
}