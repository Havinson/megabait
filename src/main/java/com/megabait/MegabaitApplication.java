package com.megabait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
@ServletComponentScan
public class MegabaitApplication {

	public static void main(String[] args) {
		SpringApplication.run(MegabaitApplication.class, args);
	}
}
