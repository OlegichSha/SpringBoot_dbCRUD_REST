package com.example.db.controllers;

import com.example.db.entity.User;
import com.example.db.service.IServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private IServiceUser serviceUser;

    @PostMapping(path = "/add")
    public @ResponseBody User addNewUser(@RequestParam String name, @RequestParam String email){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        User result = serviceUser.addUser(user);
        return result;
    }

    @PostMapping(path = "/addAll")
    public @ResponseBody Iterable<User> addNewAllUser(@RequestBody Iterable<User> users){
        Iterable<User> result = serviceUser.addAllUsers(users);
        return result;
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        return serviceUser.findAll();
    }
}
