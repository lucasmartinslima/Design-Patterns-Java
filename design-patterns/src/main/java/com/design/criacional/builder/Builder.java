package com.design.criacional.builder; 

public class Builder {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard.Builder()
                .name("Lucas Martins de Lima")
                .cvv(123) 
                .number("2384 3243 1232 5355")
                .band("mastercard")
                .build();

                System.out.println(creditCard.toString()); 
    }
}
