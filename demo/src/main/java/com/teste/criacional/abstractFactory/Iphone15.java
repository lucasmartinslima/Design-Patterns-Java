package com.teste.criacional.abstractFactory;

public class Iphone15 implements Iphone {

    private String modelo = "Iphone 15";

    @Override
    public Iphone15 clone() {
        return this;
    }

    @Override
    public void modelo(){
       System.out.println("Modelo do Iphone: "+ this.modelo);
    }
}
