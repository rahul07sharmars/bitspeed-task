package com.example.bitespeedbackendtask.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Contact implements Comparable<Contact> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phoneNumber;
    private String email;
    private Long linkedId;

    private String linkPrecedence;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Timestamp createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private Timestamp updatedAt;

    private Timestamp deletedAt;

    public Contact(ContactDTO contactDTO) {
        this.email = contactDTO.getEmail();
        this.phoneNumber = contactDTO.getPhoneNumber();
        this.linkPrecedence = "primary";
        this.createdAt = new Timestamp(System.currentTimeMillis());
        this.updatedAt = new Timestamp(System.currentTimeMillis());
    }

    @Override
    public int compareTo(Contact other) {
        return this.createdAt.compareTo(other.createdAt);
    }
}
