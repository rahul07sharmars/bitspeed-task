package com.example.bitespeedbackendtask.service;

import com.example.bitespeedbackendtask.model.ContactDTO;
import com.example.bitespeedbackendtask.model.ResponseModal;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface ContactService {

    ResponseModal fetchContact(ContactDTO contactDTO) throws JsonProcessingException;
}
