package com.design.criacional.Singleton;

// Singleton
public class DataBase {
    private static DataBase db;

    private DataBase() {
    }

    public static DataBase getInstance() {
        if (db == null) {
            db = new DataBase();
            System.out.println("Nova instancia de DataBase criada.");
            return db;
        }
        System.out.println("Retornando instancia criada anteriormente.");
        return db;
    }
}
