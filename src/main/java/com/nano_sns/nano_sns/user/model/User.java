package com.nano_sns.nano_sns.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    private String id;
    private String username;
    private String fullName;
    private String bio;
    private String website;
    private String profilePicture;
}