package br.com.screeMatch.scrennMatch;

import br.com.screeMatch.scrennMatch.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ScrennMatchApplication implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {

	}

	public static void main(String[] args) {
		SpringApplication.run(ScrennMatchApplication.class, args);
		// Instanciando
		Principal principal = new Principal();
		principal.exibeMenu();




}}
