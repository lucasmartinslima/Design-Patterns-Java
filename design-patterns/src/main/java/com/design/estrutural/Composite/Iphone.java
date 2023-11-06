package com.design.estrutural.Composite;

public class Iphone extends Produto{

    Iphone(Double preco){
        this.preco = preco;
    }

    @Override
    public void addProduct(Produto produto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addProduct'");
    }

    @Override
    public Double precoTotal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'precoTotal'");
    }
    
}
