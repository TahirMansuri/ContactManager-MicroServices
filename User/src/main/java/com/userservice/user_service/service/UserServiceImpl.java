package com.userservice.user_service.service;

import com.userservice.user_service.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{

    /***
     *   Fake Predefined User Data
     */
    List<User> listOfUser = List.of(
            new User(101L,"Nayan","9988998899"),
            new User(102L,"Gagan","9988776655"),
            new User(103L,"Raman","9900998899")
    );

    /***
     * Methode to get User Data by userId
     * @param userId
     * @return
     */
    @Override
    public User getUser(Long userId) {
        return listOfUser.stream().filter(user -> user.getUserId().equals(userId)).findAny().orElseThrow(null);
    }
}
