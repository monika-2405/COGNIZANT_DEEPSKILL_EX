package com.cognizant.authenticationservice.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.authenticationservice.model.AuthenticationResponse;
import com.cognizant.authenticationservice.util.JwtUtil;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String authHeader) {

        String base64Credentials = authHeader.substring(6);

        byte[] decodedBytes = Base64.getDecoder().decode(base64Credentials);

        String credentials = new String(decodedBytes, StandardCharsets.UTF_8);

        String[] values = credentials.split(":");

        String username = values[0];
        String password = values[1];

        if (!username.equals("user") || !password.equals("pwd")) {
            throw new RuntimeException("Invalid Credentials");
        }

        String token = JwtUtil.generateToken(username);

        return new AuthenticationResponse(token);
    }
}