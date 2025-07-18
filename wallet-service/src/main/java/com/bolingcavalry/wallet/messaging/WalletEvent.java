package com.bolingcavalry.wallet.messaging;

import com.bolingcavalry.wallet.entity.enums.TransactionType;
import lombok.Data;
import java.math.BigDecimal;
import java.util.UUID;

@Data
public class WalletEvent {
    private UUID walletId;
    private TransactionType type;
    private BigDecimal amount;
    private UUID targetWalletId;
    private String description;
    private long timestamp;
} 