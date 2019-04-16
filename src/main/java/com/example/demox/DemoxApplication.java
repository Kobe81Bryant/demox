package com.example.demox;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demox.mapper")
public class DemoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoxApplication.class, args);
	}

}
