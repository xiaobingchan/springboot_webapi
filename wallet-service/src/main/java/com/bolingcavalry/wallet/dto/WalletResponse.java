package com.bolingcavalry.wallet.dto;

import lombok.Data;
import java.math.BigDecimal;
import java.util.UUID;

@Data
public class WalletResponse {
    private UUID id;
    private String userId;
    private BigDecimal balance;
} 