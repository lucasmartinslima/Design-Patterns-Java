package com.design.estrutural.Decorator;

// Objetivo: Alterar a estrutura do objeto dinamicamente, ou seja, adicionar novas funcionalidades/responsabilidades. Alternativa flexível a herança.
public class Decorator {
    public static void main(String[] args) {

        Document document = new DocumentPDF("Este é um texto teste para exemplo.");
        System.out.println(document.text());

        // Usando o Decorator UpperCase, isso fará com que o texto se transforme em caixa alta. Uma implementação simples, porem importante para projetos grandes
        document = new UpperCaseDocument(document);
        Document documentUpper = new UpperCaseDocument(document);
        System.out.println(documentUpper.text()); 
 
    }
}
