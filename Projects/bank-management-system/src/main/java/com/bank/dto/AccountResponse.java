package com.bank.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record AccountResponse(
    Long id,
    String accountNumber,
    String accountHolderName,
    BigDecimal balance,
    LocalDateTime createdAt
) {}
