package com.userservice.user_service.controller;


import com.userservice.user_service.entity.User;
import com.userservice.user_service.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    /***
     * User Service Auto Wired for Performing User Operations
     */
    @Autowired
    UserServiceImpl userService;

    /**
     * RestTemplate Autowired to call Contact Service API
     */
    @Autowired
    RestTemplate restTemplate;

    /***
     * API to fetch User Data by User ID
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId){

        User user = userService.getUser(userId);

        // Calling Contact Rest API using RestTemplate object
        //List contactList = restTemplate.getForObject("http://localhost:9002/contact/user/"+userId,List.class);

        //After Setting Eureka Instance Hostname and Service Name we directly map URL with Service Name
        List contactList = restTemplate.getForObject("http://contact-service/contact/user/"+userId,List.class);

        //Setting contact list consumed from Contact API call
        user.setContactList(contactList);

        return user;
    }

}
