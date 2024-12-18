package com.example.FirstTrySpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(proxyTargetClass = true)
@SpringBootApplication
public class FirstTrySpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstTrySpringBootApplication.class, args);
	}

}
