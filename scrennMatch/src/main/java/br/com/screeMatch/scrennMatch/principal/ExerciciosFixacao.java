package br.com.screeMatch.scrennMatch.principal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ExerciciosFixacao {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);
        Optional<Integer> numero = numeros.stream()
                .max(Integer::compareTo);
        System.out.println(numero);
    }
}
