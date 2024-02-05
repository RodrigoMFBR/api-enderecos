package com.rodrigomf.apienderecos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class ApiEnderecosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiEnderecosApplication.class, args);
	}

}
