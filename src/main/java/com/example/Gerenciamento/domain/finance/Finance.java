package com.example.Gerenciamento.domain.finance;


import com.example.Gerenciamento.domain.court.Court;
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

    @Id
    @Column(name = "number_process")
    private String numberProcess;

    @Column(name = "value_process")
    private Float valueProcess;

    @Column(name = "portion")
    private Float portion;

    @Column(name = "percent")
    private Double percent;

    @Column(name = "value_percent")
    private Float valuePercent;

    public Finance (RequestFinance requestFinance){
        this.valueProcess = requestFinance.valueProcess();
        this.portion = requestFinance.portion();
        this.percent = requestFinance.percent();
        this.valuePercent = requestFinance.valuePercent();
        this.numberProcess = requestFinance.numberProcess();
    }
}
