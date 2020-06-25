package com.soprasteria.apizator;

import com.soprasteria.apizator.ApiController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApizatorApplication {

	public ApiController apiController;

	public static void main(String[] args) {
		SpringApplication.run(com.soprasteria.apizator.ApizatorApplication.class, args);
	}


}
