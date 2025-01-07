package dev.correa.arquitetura;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import static org.springframework.boot.Banner.Mode.OFF;

@SpringBootApplication
public class Application {
	
	public static void main (String[] args) {
		//SpringApplication.run(Application.class, args);
		
		SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class);
		
		builder.run(args);
		
		builder.bannerMode(OFF);
		ConfigurableApplicationContext context = builder.context();
		
		ConfigurableEnvironment environment = context.getEnvironment();
		String name = environment.getProperty("spring.application.name");
		
		System.out.println("Nome da aplicaçao: " + name);
		
		
		
	}
	
}
