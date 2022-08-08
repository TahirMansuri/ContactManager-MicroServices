package com.contactservice.contact_service.service;

import com.contactservice.contact_service.entity.Contact;

import java.util.List;

public interface IContactService {

    List<Contact> getContactOfUser(Long userId);

}
