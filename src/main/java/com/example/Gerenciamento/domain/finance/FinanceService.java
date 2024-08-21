package com.example.Gerenciamento.domain.finance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class FinanceService {

    @Autowired
    private FinanceRepository financeRepository;

    public ResponseEntity findAll(){
        var findAll = financeRepository.findAll();
        return ResponseEntity.ok(findAll);
    }
}
