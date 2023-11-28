package com.design.criacional.builder;

import java.security.Timestamp;

public class CreditCard {

    private String name;
    private String number;
    private int cvv;
    private Timestamp validThru;
    private String band;
    private Double limit;

    // Construtor privado
    private CreditCard(Builder builder) {
        this.name = builder.name;
        this.number = builder.number;
        this.cvv = builder.cvv;
        this.validThru = builder.validThru;
        this.band = builder.band;
        this.limit = builder.limit;
        // inicializar outros atributos...
    }

    // Getters e Setters

    @Override
    public String toString() {
        return new StringBuilder("\nName: " + this.name + "\nNumber: " + this.number + "\nCVV: " + this.cvv + "\nvalid: "
                + this.validThru + "\nband: " + this.band + "\nLimit: " + this.limit).toString();
    }

    // Classe Builder
    public static class Builder {
        private String name;
        private String number;
        private int cvv;
        private Timestamp validThru;
        private String band;
        private Double limit;
        // outros atributos...

        public Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder number(String number) {
            this.number = number;
            return this;
        }

        public Builder cvv(int cvv) {
            this.cvv = cvv;
            return this;
        }

        public Builder validThru(Timestamp validThru) {
            this.validThru = validThru;
            return this;
        }

        public Builder band(String band) {
            this.band = band;
            return this;
        }

        public Builder limit(Double limit) {
            this.limit = limit;
            return this;
        }

        // outros métodos para definir outros atributos...

        public CreditCard build() {
            return new CreditCard(this);
        }
    }
}
