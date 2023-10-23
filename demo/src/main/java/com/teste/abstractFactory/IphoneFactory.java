package com.teste.abstractFactory;

import java.util.HashMap;

public class IphoneFactory implements AbstractFactory<Iphone> {

    //Prototype 
    HashMap<String, Iphone> prototypeIphone = new HashMap<>();

    public IphoneFactory(){
        prototypeIphone.put("Iphone 13", new Iphone13()); 
        prototypeIphone.put("Iphone 15", new Iphone15()); 
    }

    @Override
    public Iphone create(String type) {
        return prototypeIphone.get(type).clone();
    }
    

   
}
