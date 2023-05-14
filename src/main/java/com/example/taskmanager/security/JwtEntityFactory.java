package com.example.taskmanager.security;

import com.example.taskmanager.model.User;

public class JwtEntityFactory {

    public static JwtEntity create(User user) {
        return new JwtEntity(user);
    }

}
