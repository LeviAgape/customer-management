package com.example.Gerenciamento.domain.court;

import com.example.Gerenciamento.domain.user.RequestUser;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="court")
@Entity(name="court")
public class Court {

    private String numberProcess;

    private String forumName;

    private Integer forumNumber;

    private String author;

    private String defendant;

    private String proceduralSituation;

    private String processStatus;

    private String pendencies;

    private String observation;

    private LocalDate processDate;

    private String partner;

    private String department;

    private Boolean winOrLose;

    public Court(RequestCourt requestCourt){
        this.numberProcess = requestCourt.numberProcess();
        this.forumName = requestCourt.forumName();
        this.forumNumber = requestCourt.forumNumber();
        this.author = requestCourt.author();
        this.defendant = requestCourt.defendant();
        this.proceduralSituation = requestCourt.proceduralSituation();
        this.processStatus = requestCourt.processStatus();
        this.pendencies = requestCourt.pendencies();
        this.observation = requestCourt.observation();
        this.processDate = requestCourt.processDate();
        this.partner = requestCourt.partner();
        this.department = requestCourt.department();
        this.winOrLose = requestCourt.winOrLose();
    }
}
