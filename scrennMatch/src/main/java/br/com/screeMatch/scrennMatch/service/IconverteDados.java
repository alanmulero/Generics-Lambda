package br.com.screeMatch.scrennMatch.service;

public interface IconverteDados {

    <T> T obterDados(String json, Class<T> classe);
}
