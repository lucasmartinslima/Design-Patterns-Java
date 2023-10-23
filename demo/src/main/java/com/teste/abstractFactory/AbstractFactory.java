package com.teste.abstractFactory; 

public interface AbstractFactory<T> {
    T create(String type);
}
