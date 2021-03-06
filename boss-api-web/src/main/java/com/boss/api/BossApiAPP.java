package com.boss.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableJpaRepositories(basePackages = "com.boss.api.repository")
@SpringBootApplication
@EnableAsync
@EnableCaching
@EnableFeignClients
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableCircuitBreaker
@ComponentScan(basePackages = {"com.boss.api", "com.h.jamil.api.framework"})
public class BossApiAPP {

    public static void main(String[] args) {
        SpringApplication.run(BossApiAPP.class, args);
    }
}
