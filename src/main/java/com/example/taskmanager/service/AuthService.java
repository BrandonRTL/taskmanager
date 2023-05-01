package com.example.taskmanager.service;


import com.example.taskmanager.security.JwtRequest;
import com.example.taskmanager.security.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);

}
