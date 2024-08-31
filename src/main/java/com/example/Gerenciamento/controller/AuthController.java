package com.example.Gerenciamento.controller;

import com.example.Gerenciamento.domain.dto.RegisterUserDTO;
import com.example.Gerenciamento.domain.dto.ResponseUserDTO;
import com.example.Gerenciamento.domain.dto.UserRequestDTO;
import com.example.Gerenciamento.domain.user.User;
import com.example.Gerenciamento.domain.user.UserRepository;
import com.example.Gerenciamento.infra.security.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final TokenService tokenService;

    @PostMapping("/login")
    public ResponseEntity loginUser(@RequestBody UserRequestDTO data){
        User user = this.userRepository.findByLogin(data.login()).orElseThrow(() -> new RuntimeException("User not found"));
        if (passwordEncoder.matches(data.password(), user.getPassword())) {
            String token = this.tokenService.generateToken(user);
            return  ResponseEntity.ok(new ResponseUserDTO(user.getLogin(), token));
        }
        return ResponseEntity.badRequest().build();
    }
    @PostMapping("/register")
    public ResponseEntity register(@RequestBody RegisterUserDTO body){
        Optional<User> user = this.userRepository.findByLogin(body.login());

        if(user.isEmpty()) {
            User newUser = new User();
            newUser.setPassword(passwordEncoder.encode(body.password()));
            newUser.setLogin(body.login());
            this.userRepository.save(newUser);

            String token = this.tokenService.generateToken(newUser);
            return ResponseEntity.ok(new ResponseUserDTO(newUser.getLogin(), token));
        }
        return ResponseEntity.badRequest().build();
    }
}
