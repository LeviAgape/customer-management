package com.example.Gerenciamento.domain.court;

import com.example.Gerenciamento.domain.finance.Finance;
import com.example.Gerenciamento.domain.finance.FinanceRepository;
import com.example.Gerenciamento.domain.finance.RequestFinance;
import jakarta.persistence.EntityNotFoundException;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class CourtService {

    @Autowired
    private CourtRepository courtRepository;

    @Autowired
    private FinanceRepository financeRepository;

    public ResponseEntity findAllCourts(){
        var findAll = courtRepository.findAll();
        return ResponseEntity.ok(findAll);
    }

    public ResponseEntity findById(String numberProcess){
        var findById = courtRepository.findById(numberProcess);
        return ResponseEntity.ok(findById);
    }

    public ResponseEntity findByDefendant(String defendant){
        Optional <Court> optionalCourt = courtRepository.findByDefendant(defendant);
        return ResponseEntity.ok(optionalCourt);
    }

    public ResponseEntity registerCourt(@Validated @RequestBody RequestCourt data){
        Court newCourt = new Court(data);
        courtRepository.save(newCourt);
        return ResponseEntity.ok().body("Novo processo registrado");
    }
}
