package com.bolingcavalry.wallet.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.time.Clock;

@Configuration
public class UTCClock {
    @Bean
    public Clock clock() {
        return Clock.systemUTC();
    }
} 