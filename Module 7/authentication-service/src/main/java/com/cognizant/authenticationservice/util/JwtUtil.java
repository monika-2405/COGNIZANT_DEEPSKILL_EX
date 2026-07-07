package com.cognizant.authenticationservice.util;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtUtil {

    private static final String SECRET = "mysecretkeymysecretkeymysecretkey12";

    public static String generateToken(String username) {

        Key key = new SecretKeySpec(
                SECRET.getBytes(StandardCharsets.UTF_8),
                SignatureAlgorithm.HS256.getJcaName());

        return Jwts.builder()
                .subject(username)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 20 * 60 * 1000))
                .signWith(key)
                .compact();
    }
}