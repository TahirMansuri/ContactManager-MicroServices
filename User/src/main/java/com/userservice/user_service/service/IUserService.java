package com.userservice.user_service.service;

import com.userservice.user_service.entity.User;

import java.util.List;

public interface IUserService {

    /***
     * Methode for Getting User Data by userId
     * @param userId
     * @return
     */
    public User getUser(Long userId);

}
