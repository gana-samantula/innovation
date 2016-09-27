package com.learning.chainofresponsibility;
public class MulNumbers implements Chain {
    
    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextchain) {
	this.nextChain=nextchain;
    }

    @Override
    public void calculate(Numbers request) {
	
	if(request.getCalculationWanted()=="mul"){
	    System.out.println(request.getNumber1()+" * " + request.getNumber2()+ "=" + (request.getNumber1()/request.getNumber2()));
	    
	}else{
	    nextChain.calculate(request);
	    
	}
	
	
    }
    
    
}