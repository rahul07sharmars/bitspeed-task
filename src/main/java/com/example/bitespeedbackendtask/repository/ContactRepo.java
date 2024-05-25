package com.example.bitespeedbackendtask.repository;

import com.example.bitespeedbackendtask.model.Contact;
import com.example.bitespeedbackendtask.model.ContactDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Integer> {

    List<Contact> findByPhoneNumber(String phoneNumber);

    List<Contact> findByEmail(String email);

    void save(ContactDTO contactDTO);

}
