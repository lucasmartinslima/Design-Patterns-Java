package com.design.estrutural.Composite;

public abstract class Produto {

    public Double preco;

    public abstract void addProduct(Produto produto);
    public abstract Double precoTotal();

    
}
