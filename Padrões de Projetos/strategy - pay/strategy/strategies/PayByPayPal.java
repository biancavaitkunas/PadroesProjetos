package edu.ifsc.gof.strategy.strategies;

import edu.ifsc.gof.strategy.interfaces.PayStrategy;

public class PayByPayPal implements PayStrategy {

    @Override
    public boolean pay() {
       System.out.println("Pagando com PayPal!");
       return true;
    }

}