package com.example.bitespeedbackendtask.controller;

import com.example.bitespeedbackendtask.model.ContactDTO;
import com.example.bitespeedbackendtask.model.ResponseModal;
import com.example.bitespeedbackendtask.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @Autowired
    ContactService contactService;

    @PostMapping("/identify")
    public ResponseModal identifyContact(@RequestBody ContactDTO contactDTO) {
        try {
            return contactService.fetchContact(contactDTO);
        } catch (Exception e) {
            System.out.println(e);
        }
        return new ResponseModal();
    }

    @GetMapping("/test")
    public String testfunction() {
        System.out.println("test SuccessFull");
        return "SuccessFull";
    }
}
