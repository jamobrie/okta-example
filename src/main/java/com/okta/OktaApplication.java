package com.okta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OktaApplication {

    public static void main(String[] args) {
        SpringApplication.run(OktaApplication.class, args);

        System.out.println("App has started");
    }

}
