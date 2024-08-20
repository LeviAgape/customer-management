package com.example.Gerenciamento.domain.court;

import org.springframework.http.ResponseEntity;

public class CourtService {

    private CourtRepository courtRepository;

    public ResponseEntity findAllCourts(){
        var findAll = courtRepository.findAll();
        return ResponseEntity.ok(findAll);
    }
}
