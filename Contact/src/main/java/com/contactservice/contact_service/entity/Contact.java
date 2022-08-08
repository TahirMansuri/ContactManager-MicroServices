package com.contactservice.contact_service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

    private Long cId;
    private String email;
    private String contactName;

    /***
     * userId as Foreign Key for defining User ID from User Table
     */
    private Long userId;


}