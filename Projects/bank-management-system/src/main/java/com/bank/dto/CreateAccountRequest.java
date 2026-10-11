package com.bank.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

public record CreateAccountRequest(
    @NotBlank(message = "Account holder name is required")
    String accountHolderName,

    @NotNull(message = "Initial deposit amount is required")
    @DecimalMin(value = "0.00", message = "Initial deposit amount cannot be negative")
    BigDecimal initialDeposit

) {}