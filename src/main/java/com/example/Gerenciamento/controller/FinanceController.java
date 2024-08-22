package com.example.Gerenciamento.controller;

import com.example.Gerenciamento.domain.finance.FinanceService;
import com.example.Gerenciamento.domain.finance.RequestFinance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/finance")
public class FinanceController {

    @Autowired
    private FinanceService financeService;

    @GetMapping
    public ResponseEntity findAll(){
        return financeService.findAll();
    }

    @PostMapping
    public ResponseEntity registerFinance(@Validated @RequestBody RequestFinance data){
        return financeService.registerFinance(data);
    }
}
