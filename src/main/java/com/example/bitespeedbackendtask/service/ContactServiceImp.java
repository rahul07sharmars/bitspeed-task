package com.example.bitespeedbackendtask.service;

import com.example.bitespeedbackendtask.model.Contact;
import com.example.bitespeedbackendtask.model.ContactDTO;
import com.example.bitespeedbackendtask.model.ResponseModal;
import com.example.bitespeedbackendtask.repository.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@Service
public class ContactServiceImp implements ContactService {

    @Autowired
    ContactRepo contactRepo;

    public ResponseModal fetchContact(ContactDTO contactDTO) {
        ResponseModal responseModal = new ResponseModal();
        System.out.println("contactDTO.toString()" + contactDTO.toString());
        List<Contact> sameEmail = contactRepo.findByEmail(contactDTO.getEmail());
        List<Contact> samePhone = contactRepo.findByPhoneNumber(contactDTO.getPhoneNumber());
        System.out.println("SameEmail " + sameEmail.size());
        for (int i = 0; i < sameEmail.size(); i++) {
            System.out.println("index " + i + " " + sameEmail.get(i).toString());
        }
        System.out.println("samePhone " + samePhone.size());
        for (int i = 0; i < samePhone.size(); i++) {
            System.out.println("index " + i + " " + samePhone.get(i).toString());
        }
        if (samePhone.size() == 0 && sameEmail.size() == 0) {

            Contact contact = new Contact(contactDTO);
            contactRepo.save(contact);
            System.out.println("Data Saved");
        } else {
            Set<Contact> contactSet = new TreeSet<>(sameEmail);
            contactSet.addAll(samePhone);
            System.out.println("newContact " + contactSet.size());
            Iterator<Contact> iterator = contactSet.iterator();
            if (iterator.hasNext()) {
                iterator.next();
            }
            while (iterator.hasNext()) {
                Contact contact = iterator.next();
                contact.setLinkPrecedence("secondary");
                contactRepo.save(contact);
                System.out.println(contact.toString());
            }
        }
        return responseModal;
    }
}
