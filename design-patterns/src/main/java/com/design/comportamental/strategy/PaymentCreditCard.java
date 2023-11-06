package com.design.comportamental.strategy;

import java.math.BigDecimal;

public class PaymentCreditCard implements PaymentStrategy {

    @Override
    public void pay(BigDecimal valor) {
        System.out.println("Pagamento em Credito efetuado com sucesso");
    }
}
