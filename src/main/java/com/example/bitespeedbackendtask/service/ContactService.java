package com.example.bitespeedbackendtask.service;

import com.example.bitespeedbackendtask.model.ContactDTO;
import com.example.bitespeedbackendtask.model.ResponseModal;

public interface ContactService {

    ResponseModal fetchContact(ContactDTO contactDTO);
}
