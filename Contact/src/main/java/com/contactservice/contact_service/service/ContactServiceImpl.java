package com.contactservice.contact_service.service;

import com.contactservice.contact_service.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements IContactService{

    //Predefined Contact Data
    List<Contact> contactList = List.of(
            new Contact(1L,"nayan@gmail.com","9809980998",101L),
            new Contact(2L,"gagan@gmail.com","6789878987",102L),
            new Contact(3L,"raman@gmail.com","8789878987",101L)
    );

    /***
     * Mothod to Return Contact List by User ID
     * @param userId
     * @return
     */
    @Override
    public List<Contact> getContactOfUser(Long userId) {
        /***
         * Stream API use to get Contact List only match by UserID
         */
        return contactList.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }

}
