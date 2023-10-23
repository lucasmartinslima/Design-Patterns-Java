package com.design.estrutural.Decorator;

public class UpperCaseDocument extends DocumentDecorator{

    UpperCaseDocument(Document doc) {
        super(doc); 
    } 
  
    public String text() { 
        return documentDecoraded.text().toUpperCase();
    }
    
}
