package com.bolingcavalry.wallet.controller;

import com.bolingcavalry.wallet.dto.TransactionRequest;
import com.bolingcavalry.wallet.dto.WalletResponse;
import com.bolingcavalry.wallet.service.WalletService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/wallets")
@RequiredArgsConstructor
public class WalletController {
    private final WalletService walletService;

    @GetMapping("/{userId}")
    public ResponseEntity<WalletResponse> getWallet(@PathVariable String userId) {
        return ResponseEntity.ok(walletService.getWallet(userId));
    }

    @PostMapping("/{userId}/deposit")
    public ResponseEntity<WalletResponse> deposit(
            @PathVariable String userId,
            @RequestBody TransactionRequest request) {
        return ResponseEntity.ok(walletService.deposit(userId, request));
    }

    @PostMapping("/{userId}/withdraw")
    public ResponseEntity<WalletResponse> withdraw(
            @PathVariable String userId,
            @RequestBody TransactionRequest request) {
        return ResponseEntity.ok(walletService.withdraw(userId, request));
    }

    @PostMapping("/{userId}/transfer/{targetUserId}")
    public ResponseEntity<WalletResponse> transfer(
            @PathVariable String userId,
            @PathVariable UUID targetUserId,
            @RequestBody TransactionRequest request) {
        return ResponseEntity.ok(walletService.transfer(userId, targetUserId, request));
    }
} 