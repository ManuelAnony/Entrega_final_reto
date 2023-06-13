package com.nexsys.v1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class webServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(webServiceApplication.class, args);
	}

	// Configuración del bean RestTemplate para realizar solicitudes HTTP
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
