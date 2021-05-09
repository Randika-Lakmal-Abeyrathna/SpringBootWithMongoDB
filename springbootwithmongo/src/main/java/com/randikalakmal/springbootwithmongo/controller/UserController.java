package com.randikalakmal.springbootwithmongo.controller;

import com.randikalakmal.springbootwithmongo.model.User;
import com.randikalakmal.springbootwithmongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Integer id){
        return userService.getUserByID(id);
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser(id);
    }



}

