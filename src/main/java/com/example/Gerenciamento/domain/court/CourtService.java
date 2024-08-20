package com.example.Gerenciamento.domain.court;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CourtService {

    @Autowired
    private CourtRepository courtRepository;

    public ResponseEntity findAllCourts(){
        var findAll = courtRepository.findAll();
        return ResponseEntity.ok(findAll);
    }

    public ResponseEntity findById(String numberProcess){
        var findById = courtRepository.findById(numberProcess);
        return ResponseEntity.ok(findById);
    }
}
