package com.design.estrutural.Decorator;

public class DocumentPDF implements Document{
 
    String text;
    
    DocumentPDF(String text){  
        this.text = text;
    }
    
    public String text(){
        return this.text;
    }
 
}
