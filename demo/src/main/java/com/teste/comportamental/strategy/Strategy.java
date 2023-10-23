package com.teste.comportamental.strategy;

import java.math.BigDecimal;

// Strategy - interface  = PaymentStrategy.java
// Strategy - Concreta   = PaymentCreditCard.java e PaymentDebitCard.java
// Contexto              = Buy.java

// Evitando IF/ELSE e HERANÇA aplicando o padrão STRATEGY
public class Strategy {
    public static void main(String[] args) {

        BigDecimal totalValue = new BigDecimal(10);

        // O Contexto de Compra(Buy) tem dados que é passado para o pagamento(Strategy), sem necessidade de passa o objeto compra para as implementações
        Buy buy = new Buy(totalValue);

        // Pagar em debito ou credito
        buy.proccesPayment(new PaymentCreditCard());
        buy.proccesPayment(new PaymentDebitCard());

        // -- Apontamentos --
        // Perceba que a classe de compra não precisa necessariamente importa as classes de cartao de credito e debito
        // Com isso a classe de compra só conhece a interface de pagamento
        // Veja também que as implementações não precisam necessariamente conhecer a classe de compra, pois são passados os valores necessário para o pagamento
    }
}
