package com.nano_sns.nano_sns.user.model;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String id;
    private String username;
    private String fullName;
    private String bio;
    private String website;
    private String profilePicture;

    private int mediaCount;
    private int followsCount;
    private int followedByCount;
}