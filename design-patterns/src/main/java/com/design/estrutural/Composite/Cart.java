package com.design.estrutural.Composite;
 
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors; 

public class Cart extends Produto {

    List<Produto> produtos = new ArrayList<Produto>();

    @Override
    public void addProduct(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public Double precoTotal() { 
        return produtos.stream().collect(Collectors.summingDouble(p -> p.preco));
    }

    
}
