package com.demo.binaryliterals;

public class BinaryLiterals {

	public void testBinaryIntegralLiterals6() {
		int binary = 8;
		if (binary == 8) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public void testBinaryIntegralLiterals7() {
		int binary = 0b1000; // 2^3 = 8
		if (binary == 8) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
