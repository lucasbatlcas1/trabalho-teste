package com.gabriel1803.demojpa;

import com.gabriel1803.demojpa.domain.Avaliacao;
import com.gabriel1803.demojpa.domain.Professor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemojpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemojpaApplication.class, args);

		Professor p = new Professor();
		p.setNome("alessio");

		Avaliacao a = new Avaliacao();
		a.setNome("avaliacao1");

		System.out.println("Minha Primeira Aplicação");
	}
}
