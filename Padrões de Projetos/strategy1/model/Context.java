package edu.ifsc.gof.strategy1.model;

import edu.ifsc.gof.strategy1.interfaces.InvestStrategy;

public class Context {
private InvestStrategy strategy;

   public Context(){
   }

   public void setStrategy(InvestStrategy strategy){
      this.strategy = strategy;
   }

   public double executeStrategy(double v){
      return strategy.execute(v);
   }    
}
