package br.com.alura.screenmatchpt.screenmatchpt.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
