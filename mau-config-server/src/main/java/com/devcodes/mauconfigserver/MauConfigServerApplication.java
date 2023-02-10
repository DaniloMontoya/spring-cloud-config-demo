package com.devcodes.mauconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MauConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MauConfigServerApplication.class, args);
	}

}
