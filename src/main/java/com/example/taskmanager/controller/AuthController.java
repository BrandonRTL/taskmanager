package com.example.taskmanager.controller;

import com.example.taskmanager.dto.UserDto;
import com.example.taskmanager.mapper.UserMapper;
import com.example.taskmanager.model.User;
import com.example.taskmanager.security.JwtRequest;
import com.example.taskmanager.security.JwtResponse;
import com.example.taskmanager.service.AuthService;
import com.example.taskmanager.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@Slf4j
public class AuthController {

    private final AuthService authService;
    private final UserService userService;
    private final UserMapper userMapper;

    @PostMapping("/login")
    public JwtResponse login(@RequestBody JwtRequest loginRequest) {
        log.info("LOGIN METHOD INVOKED" + loginRequest.getUsername() + " " + loginRequest.getPassword());
//        return new JwtResponse();
        return  authService.login(loginRequest);
    }

    @GetMapping("/login")
    public String getLogin() {
        return  "get login";
    }

    @PostMapping("/register")
    public UserDto register(@RequestBody UserDto userDto) {
        log.info("LOGIN METHOD INVOKED" + userDto.getUsername() + " " + userDto.getPassword());

        User user = userMapper.toEntity(userDto);
        User createdUser = userService.create(user);

        return  userMapper.toDto(createdUser);
    }

    @PostMapping("/refresh")
    public JwtResponse refresh(@RequestBody String refreshToken) {
        return authService.refresh(refreshToken);
    }
}
