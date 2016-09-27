package com.demo.multicatch;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MultiCatch {
	
	FileOutputStream fos = null;

	public void testMultiCatch6(){
	     try {
	         throw new FileNotFoundException("FileNotFoundException");
	     } catch (FileNotFoundException fnfo) {
	         fnfo.printStackTrace();
	     } catch (IOException ioe) {
	         ioe.printStackTrace();
	     }
	}

	public void testMultiCatch(){
	    	    try {
	    	    	fos = new FileOutputStream("movies.txt");
	    	    } catch (FileNotFoundException  | IOException fnfo) {
	    	        fnfo.printStackTrace();
	    	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
