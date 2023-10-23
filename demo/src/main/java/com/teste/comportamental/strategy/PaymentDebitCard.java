package com.teste.comportamental.strategy;

import java.math.BigDecimal;

public class PaymentDebitCard implements PaymentStrategy{
    
    @Override
    public void pay(BigDecimal valor){
        System.out.println("Pagamento em Debito efetuado com sucesso");
    }
}
