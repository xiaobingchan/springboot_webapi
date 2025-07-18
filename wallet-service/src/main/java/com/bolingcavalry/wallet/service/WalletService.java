package com.bolingcavalry.wallet.service;

import com.bolingcavalry.wallet.dto.TransactionRequest;
import com.bolingcavalry.wallet.dto.WalletResponse;
import java.util.UUID;

public interface WalletService {
    WalletResponse getWallet(String userId);
    WalletResponse deposit(String userId, TransactionRequest request);
    WalletResponse withdraw(String userId, TransactionRequest request);
    WalletResponse transfer(String userId, UUID targetUserId, TransactionRequest request);
} 