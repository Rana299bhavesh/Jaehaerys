package com.jaehaerys.hl7Processor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.jaehaerys.hl7Processor"})
public class Hl7Processor {
    public static void main(String[] args) {
        SpringApplication.run(Hl7Processor.class, args);
    }
}