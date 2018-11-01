package com.example.creationJ;
/**
 * @author dradadiy
 *
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.creationJ")
public class CreationJApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreationJApplication.class, args);
	}
}
