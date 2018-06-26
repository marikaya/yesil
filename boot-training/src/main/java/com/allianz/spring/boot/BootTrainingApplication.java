package com.allianz.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication(scanBasePackages = {
                                            "com.allianz.spring.boot",
                                            "com.test"
})
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class BootTrainingApplication {

    public static void main(final String[] args) {
        SpringApplication.run(BootTrainingApplication.class,
                              args);
    }
}
