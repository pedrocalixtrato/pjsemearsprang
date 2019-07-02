package com.projeto.semear;

import com.projeto.semear.config.property.SemearApiProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SemearApiProperty.class)
public class SemearApplication {

	public static void main(String[] args) {
		SpringApplication.run(SemearApplication.class, args);
	}

}
