package com.joe.aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by joker on 2022/11/24.
 */
@SpringBootApplication
public class AopApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(AopApplication.class, args);
//		context.close();
	}
}
