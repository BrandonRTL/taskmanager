package com.example.taskmanager.service.impl;

import com.example.taskmanager.security.JwtRequest;
import com.example.taskmanager.security.JwtResponse;
import com.example.taskmanager.service.AuthService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {
    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }

//    private final AuthenticationManager authenticationManager;
//    private UserService userService;
//    private final JwtTokenProvider jwtTokenProvider;
//    @Override
//    public JwtResponse login(JwtRequest loginRequest) {
//        JwtResponse jwtResponse = new JwtResponse();
//        authenticationManager.authenticate(new
//                UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
//        User user = userService.getByUsername(loginRequest.getUsername());
//        jwtResponse.setId(user.getId());
//        jwtResponse.setUsername(user.getUsername());
//        jwtResponse.setAccessToken(jwtTokenProvider.createAccessToken(user.getId()));
//        jwtResponse.setRefreshToken(jwtTokenProvider.createRefreshToken(user.getId()));
//        return jwtResponse;
//    }
//
//    @Override
//    public JwtResponse refresh(String refreshToken) {
//
//        return jwtTokenProvider.refreshUserTokens(refreshToken);
//    }
}
