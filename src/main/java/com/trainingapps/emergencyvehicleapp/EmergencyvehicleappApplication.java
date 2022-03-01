package com.trainingapps.emergencyvehicleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.ui.ModelMap;

@SpringBootApplication
public class EmergencyvehicleappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmergencyvehicleappApplication.class, args);
	}

	@Bean
	public ModelMap modelMapper()
	{
		return new ModelMap();
	}


}
