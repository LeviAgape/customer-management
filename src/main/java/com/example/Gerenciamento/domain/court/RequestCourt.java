package com.example.Gerenciamento.domain.court;

import java.time.LocalDate;

public record RequestCourt(

        String numberProcess,

        String forumName,

        Integer forumNumber,

        String author,

        String defendant,

        String proceduralSituation,

        String processStatus,

        String pending,

        String observation,

        LocalDate processDate,

        String partner,

        String department,

        Boolean winOrLose
        ) {
}
