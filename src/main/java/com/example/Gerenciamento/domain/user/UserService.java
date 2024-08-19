package com.example.Gerenciamento.domain.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity getAllUsers(){
        var getUsers = userRepository.findAll();
        return ResponseEntity.ok(getUsers);
    }
}
