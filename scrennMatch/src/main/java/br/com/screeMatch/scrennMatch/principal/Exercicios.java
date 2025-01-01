package br.com.screeMatch.scrennMatch.principal;

import java.util.*;
import java.util.stream.Collectors;

public class Exercicios {

    public static void main(String[] args) {
        // Exercícios de fixação
        // 1 - Dada a lista de números inteiros a seguir, encontre o maior número dela.

        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 55);

//		Optional<Integer> max = numeros.stream()
//				.max(Integer::compare);
//		max.ifPresent(System.out::println);  // Esperado 50

        // Tentando minha maneira:
        Optional<Integer> max = numeros.stream()
                .max(Integer::compareTo);
        System.out.println(max.get());

        // 2 - Agrupando pelo tamanho da palavra

        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");
        Map<Integer, List<String>> agrupamento = palavras.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(agrupamento);

        // 3 - Dada a lista de nomes abaixo, concatene-os separados por vírgula.

        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
        String concatenados = nomes.stream()
                .collect(Collectors.joining(","));
        System.out.println(concatenados);


        //4 - Dada a lista de números inteiros abaixo, calcule a soma dos quadrados dos números pares.

        List<Integer> numerosQuadrados = Arrays.asList(1, 2, 3, 4, 5, 6);

        int soma = numerosQuadrados.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(soma);

        // 5 - Particionando números ímpares e pares
        List<Integer> imparesPares = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> particionando = imparesPares.stream()
                .collect(Collectors.partitioningBy(e -> e % 2 == 0));
        System.out.println(particionando.get(true));
        System.out.println(particionando.get(false));






    }

}
