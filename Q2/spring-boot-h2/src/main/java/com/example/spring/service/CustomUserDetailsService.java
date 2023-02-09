package com.example.spring.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	if (!username.equals("xyz")) throw new UsernameNotFoundException(username);
        return new org.springframework.security.core.userdetails.User("xyz", "12345678", new ArrayList<>());
    }
}
