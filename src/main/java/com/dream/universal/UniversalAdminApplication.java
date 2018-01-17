package com.dream.universal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.dream.universal","com.dream.universal.service.impl" })
@MapperScan("com.dream.universal.mapper")
public class UniversalAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversalAdminApplication.class, args);
	}
}
