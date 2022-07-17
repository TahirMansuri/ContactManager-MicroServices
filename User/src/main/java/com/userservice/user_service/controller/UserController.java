package com.userservice.user_service.controller;


import com.userservice.user_service.entity.User;
import com.userservice.user_service.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    /***
     * User Service Auto Wired for Performing User Operations
     */
    @Autowired
    UserServiceImpl userService;

    /***
     * API to fetch User Data by User ID
     * @param userId
     * @return
     */
    @GetMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId){
        return userService.getUser(userId);
    }

}
