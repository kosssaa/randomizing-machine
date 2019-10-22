package com.j25.cloud.randomizingmachine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RandomizingMachineApplication {

    public static void main(String[] args) {
        SpringApplication.run(RandomizingMachineApplication.class, args);
    }

}
