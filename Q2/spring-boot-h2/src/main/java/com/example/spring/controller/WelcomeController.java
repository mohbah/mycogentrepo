package com.example.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.entity.AuthorRequest;
import com.example.spring.util.JwtUtil;


@RestController
public class WelcomeController {

    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the program";
    }

    @PostMapping("/authenticate")
    public String generateToken(@RequestBody AuthorRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName() , authRequest.getpassword())
            );
        } catch (Exception ex) {
            throw new Exception("inavalid credeantials");
        }
        return jwtUtil.generateToken(authRequest.getUserName());
    }
}