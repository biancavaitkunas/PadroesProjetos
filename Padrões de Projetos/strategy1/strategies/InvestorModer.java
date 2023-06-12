package edu.ifsc.gof.strategy1.strategies;

import edu.ifsc.gof.strategy1.interfaces.InvestStrategy;

public class InvestorModer implements InvestStrategy {

    @Override
    public double execute(double investAmount) {
        return investAmount * 1.02;
    }
    
}
