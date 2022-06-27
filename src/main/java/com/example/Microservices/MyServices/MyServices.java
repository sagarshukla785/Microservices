package com.example.Microservices.MyServices;

import com.example.Microservices.Exceptions.MyExceptions;
import com.example.Microservices.MyRepository.MyRepository;
import com.example.Microservices.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MyServices {
    @Autowired
    private MyRepository myRepository;

    public User addU(User user){
        return myRepository.save(user);
    }

    public User getU(int id){
            return myRepository.findById(id).get();

    }

}
