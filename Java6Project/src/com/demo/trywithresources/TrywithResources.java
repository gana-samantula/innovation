package com.demo.trywithresources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TrywithResources {
	
	public void testTryWithResourcesStatemen6t() throws FileNotFoundException, IOException{
	     FileInputStream in = null;
	    try {
	        in = new FileInputStream("java7.txt");
	        System.out.println(in.read());
	    } finally {
	        if (in != null) {
	            in.close();
	        }
	    }
	}
	
	public void testTryWithResourcesStatement7() throws FileNotFoundException, IOException{
	    try (FileInputStream in = new FileInputStream("java7.txt")) {
	        System.out.println(in.read());
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
