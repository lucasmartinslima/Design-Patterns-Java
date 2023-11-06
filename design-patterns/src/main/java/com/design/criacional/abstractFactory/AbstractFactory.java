package com.design.criacional.abstractFactory; 

public interface AbstractFactory<T> {
    T create(String type);
}
