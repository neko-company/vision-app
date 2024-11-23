package com.nekocompany.visionapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AllowedUser {

    @Id
    private String email;

    public AllowedUser() {}

    public AllowedUser(String email) {
        this.email = email;
    }

    // Getters and setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
