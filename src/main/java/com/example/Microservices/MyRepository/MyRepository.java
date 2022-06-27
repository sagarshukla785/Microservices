package com.example.Microservices.MyRepository;

import com.example.Microservices.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface MyRepository extends JpaRepository<User, Integer> {

}

