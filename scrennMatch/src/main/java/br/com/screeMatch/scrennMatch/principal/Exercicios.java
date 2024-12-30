package br.com.screeMatch.scrennMatch.principal;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class Exercicios {

	public static void main(String[] args) {
		// Exercícios de fixação
		// 1 - Dada a lista de números inteiros a seguir, encontre o maior número dela.
		
		List<Integer> numeros = Arrays.asList(10,20,30,40,55);
		
//		Optional<Integer> max = numeros.stream()
//				.max(Integer::compare);
//		max.ifPresent(System.out::println);  // Esperado 50
		
		// Tentando minha maneira:
		Optional<Integer> max = numeros.stream()
				.max(Integer::compareTo);
		System.out.println(max.get());
				
		// 2 - Agrupando pelo tamanho da palavra
		
		        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");


		    
		
				
		
		
		

	}

}
