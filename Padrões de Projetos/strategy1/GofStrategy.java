package edu.ifsc.gof.strategy1;

import edu.ifsc.gof.strategy1.model.Context;
import edu.ifsc.gof.strategy1.strategies.InvestorAudac;
import edu.ifsc.gof.strategy1.strategies.InvestorConserv;
import edu.ifsc.gof.strategy1.strategies.InvestorModer;

public class GofStrategy {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new InvestorConserv());
        double val = context.executeStrategy(100);
        System.out.println("O retorno do investimento foi " + val);
        context.setStrategy(new InvestorModer());
        val = context.executeStrategy(100);
        System.out.println("O retorno do investimento foi " + val);
        context.setStrategy(new InvestorAudac());
        val = context.executeStrategy(100);
        System.out.println("O retorno do investimento foi " + val);
    }
}