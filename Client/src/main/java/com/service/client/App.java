package com.service.client;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"com.service.client.mapper"})
@SpringBootApplication
public class App {

	public static void main(String[] args) {
	 SpringApplication.run(App.class, args); 
	}

}
