package br.com.edma.projetospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringBootApplication.class, args);
		int x = 0; 
		if(x >= 2) {
			System.out.println("Ok");
		}else {
			System.out.println("NOK");
		}
	}

}
