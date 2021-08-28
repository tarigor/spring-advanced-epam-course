package com.epam.telephone_directory.entity;

import java.util.HashMap;
import java.util.Map;

public class UserProfile {
    private Map<String,User> user = new HashMap<>();

    public Map<String, User> getUser() {
        return user;
    }

    public void setUser(Map<String, User> user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "user=" + user +
                '}';
    }
}
