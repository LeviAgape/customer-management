package com.example.Gerenciamento.domain.finance;

import com.example.Gerenciamento.domain.court.Court;
import com.example.Gerenciamento.domain.court.CourtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class FinanceService {

    @Autowired
    private FinanceRepository financeRepository;

    @Autowired
    private CourtRepository courtRepository;

    public ResponseEntity findAll(){
        var findAll = financeRepository.findAll();
        return ResponseEntity.ok(findAll);
    }

    public ResponseEntity<?> registerFinance(@Validated @RequestBody RequestFinance data){

        String numberProcess = data.numberProcess();

        Optional<Court> courtOptional = courtRepository.findById(numberProcess);

        if(!courtOptional.isPresent()) {
            return ResponseEntity.ok().body("Não foi possível");
        }

        Finance newFinance = new Finance (data);
        financeRepository.save(newFinance);
        return ResponseEntity.ok().body("Novo registro financeiro salvo");

    }
}
