package com.example.telecommande;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TelecommandeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelecommandeApplication.class, args);
	}

}
