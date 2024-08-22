package com.example.Gerenciamento.controller;

import com.example.Gerenciamento.domain.court.CourtService;
import com.example.Gerenciamento.domain.court.RequestCourt;
import com.example.Gerenciamento.domain.finance.RequestFinance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/court")
public class CourtController {

    @Autowired
    private CourtService courtService;

    @GetMapping
    public ResponseEntity findAlLCourts(){
        return courtService.findAllCourts();
    }

    @GetMapping("/{numberProcess}")
    public ResponseEntity findById(@PathVariable String numberProcess){
        return courtService.findById(numberProcess);
    }

    @GetMapping("/find/{defendant}")
    public ResponseEntity findByDefendant(@PathVariable String defendant){
        return courtService.findByDefendant(defendant);
    }

    @PostMapping
    public ResponseEntity createCourt(@Validated @RequestBody RequestCourt courtData, @Validated @RequestBody RequestFinance financeData){
           return courtService.createCourt(courtData, financeData);
    }
}
