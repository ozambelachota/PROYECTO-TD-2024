package com.solicitud.solicitud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.solicitud.solicitud")
public class SolicitudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SolicitudApplication.class, args);
	}

}
