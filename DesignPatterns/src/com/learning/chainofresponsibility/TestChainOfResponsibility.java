package com.learning.chainofresponsibility;

class TestChainOfResponsibility {
    public static void main(String[] args) {
	
	Chain chainCal1= new AddNumbers();
	Chain chainCal2= new SubNumbers();
	Chain chainCal3= new MulNumbers();
	Chain chainCal4= new DivNumbers();
	
	chainCal1.setNextChain(chainCal2);
	chainCal2.setNextChain(chainCal3);
	chainCal3.setNextChain(chainCal4);
	
	Numbers request= new Numbers(4, 2, "div");
	
	chainCal1.calculate(request);
	

    }
}