package com.bolingcavalry.wallet.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class TransactionRequest {
    private BigDecimal amount;
    private String description;
} 