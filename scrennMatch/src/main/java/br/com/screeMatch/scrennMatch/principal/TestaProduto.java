package br.com.screeMatch.scrennMatch.principal;

import java.util.*;
import java.util.stream.Collectors;

public class TestaProduto   {

    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 2000.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 9000.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );

        // código usando streams

        Map<String, Optional<Produto>> maisCaroPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,
                        Collectors.maxBy(Comparator.comparingDouble(Produto::getPreco))));

        System.out.println(maisCaroPorCategoria);


        // somando os valores

        Map<String, Double> somaPreco = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,
                        Collectors.summingDouble(Produto::getPreco)));
        System.out.println("Soma"+somaPreco);


    }
}
