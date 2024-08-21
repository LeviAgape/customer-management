package com.example.Gerenciamento.domain.finance;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="finance")
@Entity(name="finance")
public class Finance {

    @Id @GeneratedValue (strategy = GenerationType.UUID)
    String id;

    @Column(name = "value_process")
    Float valueProcess;

    @Column(name = "portion")
    Float portion;

    @Column(name = "percent")
    Double percent;

    @Column(name = "value_percent")
    Float valuePercent;

    public Finance (RequestFinance requestFinance){
        this.valueProcess = requestFinance.valueProcess();
        this.portion = requestFinance.portion();
        this.percent = requestFinance.percent();
        this.valuePercent = requestFinance.valuePercent();
    }
}
