package com.demo.stringsinswitch;

public class StringsInSwitch {
	
	public void testStringInSwitch6(String param){
	       final String JAVA5 = "Java 5";
	       final String JAVA6 = "Java 6";
	       final String JAVA7 = "Java 7";
	       if (param.equals(JAVA5)){
	           System.out.println(JAVA5);
	       } else if (param.equals(JAVA6)){
	           System.out.println(JAVA6);
	       } else if (param.equals(JAVA7)){
	           System.out.println(JAVA7);
	       }
	   }
	
	public void testStringInSwitch7(String param){
	       final String JAVA5 = "Java 5";
	       final String JAVA6 = "Java 6";
	       final String JAVA7 = "Java 7";
	       switch (param) {
	           case JAVA5:
	               System.out.println(JAVA5);
	               break;
	           case JAVA6:
	               System.out.println(JAVA6);
	               break;
	           case JAVA7:
	               System.out.println(JAVA7);
	               break;
	       }
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
