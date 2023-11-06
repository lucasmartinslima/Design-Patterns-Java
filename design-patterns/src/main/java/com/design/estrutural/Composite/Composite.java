package com.design.estrutural.Composite;

public class Composite {
    public static void main(String[] args) {

        // Carrinho de produtos
        Cart cart = new Cart();

        // Produtos
        Produto iphone = new Iphone(3455.89);
        Produto iphone2 = new Iphone(3685.89);

        cart.addProduct(iphone);
        cart.addProduct(iphone2);

        System.out.println(cart.precoTotal());
    }
}
