package com.teste.criacional.abstractFactory;

public class Iphone13 implements Iphone {

    private String modelo = "Iphone 13";

    @Override
    public Iphone13 clone() {
        return this;
    }

    @Override
    public void modelo(){
       System.out.println("Modelo do Iphone: "+ this.modelo);
    }
}
