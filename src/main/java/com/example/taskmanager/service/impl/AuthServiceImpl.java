package com.example.taskmanager.service.impl;

import com.example.taskmanager.model.User;
import com.example.taskmanager.security.JwtProvider;
import com.example.taskmanager.security.JwtRequest;
import com.example.taskmanager.security.JwtResponse;
import com.example.taskmanager.service.AuthService;
import com.example.taskmanager.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;
    private UserService userService;
    private final JwtProvider jwtProvider;

    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        JwtResponse jwtResponse = new JwtResponse();
        authenticationManager.authenticate(new
                UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
        User user = userService.getByUsername(loginRequest.getUsername());
        jwtResponse.setId(user.getId());
        jwtResponse.setUsername(user.getUsername());
        jwtResponse.setAccessToken(jwtProvider.createAccessToken(user.getId()));
        jwtResponse.setRefreshToken(jwtProvider.createRefreshToken(user.getId()));
        return jwtResponse;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {

        return jwtProvider.refreshUserTokens(refreshToken);
    }
}
