package com.example.Gerenciamento.controller;

import com.example.Gerenciamento.domain.finance.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/finance")
public class FinanceController {

    @Autowired
    private FinanceService financeService;

    @GetMapping
    public ResponseEntity findAll(){
        return financeService.findAll();
    }
}
