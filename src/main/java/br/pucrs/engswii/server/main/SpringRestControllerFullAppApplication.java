package br.pucrs.engswii.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"br.pucrs.engswii"})
public class SpringRestControllerFullAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestControllerFullAppApplication.class, args);
	}

}
