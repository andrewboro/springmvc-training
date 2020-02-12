package com.example.springmvc.training;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {
    private String firstName;
    @NotNull(message = "Can not be null.")
    @Size(min=1, message="Can not be empty.")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
