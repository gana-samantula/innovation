package com.demo.underscorebetweenliterals;

public class UnderscoreBetweenLiterals {
	
	public void testUnderscoresNumericLiterals6() {
       // int oneMillion_ = 1_000_000;
        int oneMillion = 1000000;
        if (oneMillion == 1000000){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
	
	public void testUnderscoresNumericLiterals7() {
	    int oneMillion_ = 1_000_000; //new
	    int oneMillion = 1000000;
	    if (oneMillion_ == oneMillion){
	        System.out.println(true);
	    } else{
	        System.out.println(false);
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
