package com.design.estrutural.Decorator;

public abstract class DocumentDecorator implements Document {

    Document documentDecoraded;

    DocumentDecorator(Document doc) {
        documentDecoraded = doc;
    } 
 
}
