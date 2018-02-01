package net.hxxtest.fanshedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
@PropertySource("classpath:config/animalsFile.properties")
public class FanshedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FanshedemoApplication.class, args);
	}
}
