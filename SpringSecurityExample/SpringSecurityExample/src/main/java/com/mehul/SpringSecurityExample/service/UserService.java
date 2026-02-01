package com.mehul.SpringSecurityExample.service;

import com.mehul.SpringSecurityExample.entity.Users;
import com.mehul.SpringSecurityExample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    private final UserRepository userRepository;
//    private final JwtService jwtService;
    private final AuthenticationManager authManager;
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10);

    @Autowired
    public UserService(UserRepository userRepository, AuthenticationManager authManager) {
        this.userRepository = userRepository;
//        this.jwtService = jwtService;
        this.authManager = authManager;
    }

    public Users register(Users user) {
        user.setPassword(encoder.encode(user.getPassword()));
        userRepository.save(user);
        return user;
    }

//    public String verify(Users user) {
//        try {
//            Authentication authentication = authManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword())  // raw password OK
//            );
////            if (authentication.isAuthenticated()) {
////                return jwtService.generateToken(user.getUsername());
////            }
//        } catch (Exception e) {
//            System.out.println("Auth failed: " + e.getMessage());  // Add logging
//        }
//        return "fail";
//    }

}
