package com.bolingcavalry.wallet.repository;

import com.bolingcavalry.wallet.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, UUID> {
    Wallet findByUserId(String userId);
} 