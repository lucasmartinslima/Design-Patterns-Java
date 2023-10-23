package com.teste.comportamental.strategy;

import java.math.BigDecimal;

public class Buy {
    BigDecimal valueBuy;

    public Buy(BigDecimal value){
        this.valueBuy = value;
    }

    void proccesPayment(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(valueBuy);
    }
}
