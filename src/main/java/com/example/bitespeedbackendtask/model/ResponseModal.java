package com.example.bitespeedbackendtask.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


@Getter
public class ResponseModal {

    private Long primaryContatctId;
    private List<String> emails;
    private List<String> phoneNumber;
    private List<Long> secondaryContactIds;

    public ResponseModal(Long primaryContatctId, List<String> emails, List<String> phoneNumber, List<Long> secondaryContactIds) {
        this.primaryContatctId = primaryContatctId;
        this.emails = emails;
        this.phoneNumber = phoneNumber;
        this.secondaryContactIds = secondaryContactIds;
    }

    public ResponseModal() {
        this.emails = new ArrayList<>();
        this.phoneNumber = new ArrayList<>();
        this.secondaryContactIds = new ArrayList<>();
    }

    public void setPrimaryContatctId(Long primaryContatctId) {
        this.primaryContatctId = primaryContatctId;
    }

    public void setEmails(String email) {
        this.emails.add(email);
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber.add(phoneNumber);
    }

    public void setSecondaryContactIds(Long secondaryContactIds) {
        this.secondaryContactIds.add(secondaryContactIds);
    }

}
