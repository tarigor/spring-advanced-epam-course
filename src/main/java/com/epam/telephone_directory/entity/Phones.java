package com.epam.telephone_directory.entity;

import java.util.Map;

public class Phones {
    private String phoneDescription;
    private String phoneNumber;

    public String getPhoneDescription() {
        return phoneDescription;
    }

    public void setPhoneDescription(String phoneDescription) {
        this.phoneDescription = phoneDescription;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Phones{" +
                "phoneDescription='" + phoneDescription + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
