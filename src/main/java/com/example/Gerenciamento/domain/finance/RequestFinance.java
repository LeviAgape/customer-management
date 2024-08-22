package com.example.Gerenciamento.domain.finance;


public record RequestFinance(
        String numberProcess,

        Float valueProcess,

        Float portion,

        Double percent,

        Float valuePercent
) {
}
