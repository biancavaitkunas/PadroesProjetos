package edu.ifsc.gof.strategy;

import edu.ifsc.gof.strategy.model.Order;
import edu.ifsc.gof.strategy.strategies.PayByCreditCard;
import edu.ifsc.gof.strategy.strategies.PayByPayPal;
import edu.ifsc.gof.strategy.interfaces.PayStrategy;

public class GofStrategy {

    public static void main(String[] args) {
        Order order = new Order();
        PayStrategy strategy;

        strategy = new PayByPayPal();
        order.processOrder(strategy);
        strategy = new PayByCreditCard();
        order.processOrder(strategy);
    }
}