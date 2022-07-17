package com.userservice.user_service.entity;

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
    private Long userId;


}
