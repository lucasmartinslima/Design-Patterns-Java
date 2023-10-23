package com.design.comportamental.strategy;

import java.math.BigDecimal;

public class Buy {
    BigDecimal valueBuy;

    public Buy(BigDecimal value){
        this.valueBuy = value;
    }

    // Perceba que ele recebe uma interface apenas, não importa quem implementa
    void proccesPayment(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(valueBuy);
    }
}
