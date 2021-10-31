package com.sampiyonlarligi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan(basePackages = {"com.sampiyonlarligi.memberController"})
@ComponentScan(basePackages = {"com.sampiyonlarligi.service"})
@ComponentScan(basePackages = {"com.sampiyonlarligi.member"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
