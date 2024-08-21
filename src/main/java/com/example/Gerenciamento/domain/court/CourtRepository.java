package com.example.Gerenciamento.domain.court;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourtRepository extends JpaRepository<Court, String> {
    Optional<Court> findByDefendant(String defendant);
}
