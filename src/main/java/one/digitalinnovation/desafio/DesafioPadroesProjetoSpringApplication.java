package one.digitalinnovation.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DesafioPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioPadroesProjetoSpringApplication.class, args);
	}

}
