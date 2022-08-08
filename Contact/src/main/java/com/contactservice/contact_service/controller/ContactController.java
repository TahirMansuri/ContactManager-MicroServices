package com.contactservice.contact_service.controller;

import com.contactservice.contact_service.entity.Contact;
import com.contactservice.contact_service.service.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    /**
     * Contact Service Autowired
     */
    @Autowired
    ContactServiceImpl contactService;

    /***
     * Method to get Contact List by User ID
     * @param userId
     * @return
     */
    @GetMapping("/user/{userId}")
    public List<Contact> getContactById(@PathVariable("userId") long userId){
        return contactService.getContactOfUser(userId);
    }

}
