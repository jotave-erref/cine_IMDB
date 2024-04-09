package com.jotaveerref.cineIMDB.service;

public interface IConverteDados {
    <T> T conversorDeDados(String json, Class<T> classe);
}
