package es.dsw.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"es.dsw"})
public class JavaSpringBootProjectDemo12Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringBootProjectDemo12Application.class, args);
	}

}
