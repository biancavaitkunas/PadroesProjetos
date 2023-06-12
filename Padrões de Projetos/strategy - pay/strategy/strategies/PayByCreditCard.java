package edu.ifsc.gof.strategy.strategies;

import edu.ifsc.gof.strategy.interfaces.PayStrategy;

public class PayByCreditCard implements PayStrategy {
    @Override
    public boolean pay() {
        System.out.println("Pagando com cartao de credito!");
        return true;
    }

}