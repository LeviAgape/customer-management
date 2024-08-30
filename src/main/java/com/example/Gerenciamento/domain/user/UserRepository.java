package com.example.Gerenciamento.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
   Optional<User> findByLogin(String login);
   Optional<User> findByPassword(String password);
}
