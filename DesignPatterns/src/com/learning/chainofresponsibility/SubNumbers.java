package com.learning.chainofresponsibility;
public class SubNumbers implements Chain {
    
    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextchain) {
	this.nextChain=nextchain;
    }

    @Override
    public void calculate(Numbers request) {
	
	if(request.getCalculationWanted()=="sub"){
	    System.out.println(request.getNumber1()+" - " + request.getNumber2()+ "=" + (request.getNumber1()-request.getNumber2()));
	    
	}else{
	    nextChain.calculate(request);
	    
	}
	
	
    }
    
    
}