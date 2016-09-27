package com.demo.workingwithpath;

import java.nio.file.Path;
import java.nio.file.Paths;

public class WorkingwithPath {
	public void pathInfo() {

        Path path= Paths.get("c:/Temp/temp");

        System.out.println("Number of Nodes:"+ path.getNameCount());

        System.out.println("File Name:"+ path.getFileName());

        System.out.println("File Root:"+ path.getRoot());

        System.out.println("File Parent:"+ path.getParent());

  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
