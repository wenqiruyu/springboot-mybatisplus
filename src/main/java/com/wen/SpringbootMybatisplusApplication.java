package com.wen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.wen"})
@MapperScan("com.wen.mapper")
public class SpringbootMybatisplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisplusApplication.class, args);
	}

}
