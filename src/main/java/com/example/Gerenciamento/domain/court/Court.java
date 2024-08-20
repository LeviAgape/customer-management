package com.example.Gerenciamento.domain.court;

import com.example.Gerenciamento.domain.user.RequestUser;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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

    @Id
    @Column(name = "number_process")
    private String numberProcess;

    @Column(name = "forum_name")
    private String forumName;

    @Column(name = "forum_number")
    private Integer forumNumber;

    @Column(name = "author")
    private String author;

    @Column(name = "defendant")
    private String defendant;

    @Column(name = "procedural_situation")
    private String proceduralSituation;

    @Column(name = "process_status")
    private String processStatus;

    @Column(name = "pending")
    private String pending;

    @Column(name = "observation", nullable = true)
    private String observation;

    @Column(name = "process_date")
    private LocalDate processDate;

    @Column(name = "partner")
    private String partner;

    @Column(name = "department")
    private String department;

    @Column(name = "win_or_lose")
    private Boolean winOrLose;

    public Court(RequestCourt requestCourt){
        this.numberProcess = requestCourt.numberProcess();
        this.forumName = requestCourt.forumName();
        this.forumNumber = requestCourt.forumNumber();
        this.author = requestCourt.author();
        this.defendant = requestCourt.defendant();
        this.proceduralSituation = requestCourt.proceduralSituation();
        this.processStatus = requestCourt.processStatus();
        this.pending = requestCourt.pending();
        this.observation = requestCourt.observation();
        this.processDate = requestCourt.processDate();
        this.partner = requestCourt.partner();
        this.department = requestCourt.department();
        this.winOrLose = requestCourt.winOrLose();
    }
}
