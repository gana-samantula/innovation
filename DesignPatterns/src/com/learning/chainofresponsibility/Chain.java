package com.learning.chainofresponsibility;
public interface Chain {  
   public void setNextChain(Chain nextchain);
   
   public void calculate(Numbers request);
}