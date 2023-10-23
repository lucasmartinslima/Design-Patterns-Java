package com.teste;

import com.teste.criacional.abstractFactory.*;

public class Main {
    public static void main(String[] args) { 

        // Abstract Factory
        // Imagine que voce possui um programa que roda em 3 Sistema operacional, com isso voce cria button para windows, linux e apple
        Iphone iphone = new IphoneFactory().create("Iphone 15"); 
        iphone.modelo();

    }
}