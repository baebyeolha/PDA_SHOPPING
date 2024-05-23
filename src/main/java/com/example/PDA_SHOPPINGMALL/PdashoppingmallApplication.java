package com.example.PDA_SHOPPINGMALL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class PdashoppingmallApplication {
    public static void main(String[] args) {
        SpringApplication.run(PdashoppingmallApplication.class, args);
    }
}
