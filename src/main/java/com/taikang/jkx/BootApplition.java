package com.taikang.jkx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.taikang.jkx.mapper")
public class BootApplition {

	public static void main(String[] args) {
		SpringApplication.run(BootApplition.class, args);
	}
}
