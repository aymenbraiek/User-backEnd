package com.devglan.Userportal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class User implements Serializable {
@Id
@GeneratedValue
    private Long id;
    private String fistName;
    private String lastName;
    private String email;

    public User(Long id, String fistName, String lastName, String email) {
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.email = email;
    }

    public User() {
    }

    public User(String fistName, String lastName, String email) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
