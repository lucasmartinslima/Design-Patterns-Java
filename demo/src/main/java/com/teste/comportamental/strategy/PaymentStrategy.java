package com.teste.comportamental.strategy;

import java.math.BigDecimal;

public interface PaymentStrategy {
    void pay(BigDecimal value); 
}
