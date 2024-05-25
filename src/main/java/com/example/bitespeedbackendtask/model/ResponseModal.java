package com.example.bitespeedbackendtask.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class ResponseModal {

    private Integer primaryContatctId;
    private List<String> emails;
    private List<String> phoneNumber;

    private List<Integer> secondaryContactIds;

}
