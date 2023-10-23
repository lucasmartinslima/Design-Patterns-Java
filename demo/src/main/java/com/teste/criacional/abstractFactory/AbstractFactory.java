package com.teste.criacional.abstractFactory; 

public interface AbstractFactory<T> {
    T create(String type);
}
