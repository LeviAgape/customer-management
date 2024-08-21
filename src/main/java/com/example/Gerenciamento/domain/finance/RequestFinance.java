package com.example.Gerenciamento.domain.finance;

import java.math.BigDecimal;

public record RequestFinance(
        String id,

        Float valueProcess,

        Float portion,

        Double percent,

        Float valuePercent
) {
}
