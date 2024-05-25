package com.example.bitespeedbackendtask.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class ContactDTO {
    private String phoneNumber;
    private String email;
    public ContactDTO() {}



    public ContactDTO(String phoneNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
