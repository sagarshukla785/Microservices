package com.example.Microservices.MyController;

import com.example.Microservices.MyServices.MyServices;
import com.example.Microservices.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
    @Autowired
    MyServices myServices;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return myServices.addU(user);
    }

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable int id){
        return myServices.getU(id);
    }
}
