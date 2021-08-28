package com.epam.telephone_directory.entity;

import java.util.Map;

public class User {
    private String firstName;
    private String lastName;
    private Map<String,Phones> phones;

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

    public Map<String, Phones> getPhones() {
        return phones;
    }

    public void setPhones(Map<String, Phones> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phones=" + phones +
                '}';
    }
}
