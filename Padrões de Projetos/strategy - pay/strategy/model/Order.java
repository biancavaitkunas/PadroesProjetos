package edu.ifsc.gof.strategy.model;

import edu.ifsc.gof.strategy.interfaces.PayStrategy;

public class Order {

    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(PayStrategy strategy) {
        strategy.pay();
    }

}    

