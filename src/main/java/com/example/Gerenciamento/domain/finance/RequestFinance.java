package com.example.Gerenciamento.domain.finance;

import java.math.BigDecimal;

public record RequestFinance(
        String number_process,

        Float valueProcess,

        Float portion,

        Double percent,

        Float valuePercent
) {
}
