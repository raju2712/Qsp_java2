package com;

public class Logical_Operator {

	public static void main(String[] args) {
		int a=24;
		int b=20;
		int c=11;
		boolean d=a++ + b++ < c++ - ++a + ++b && a++ - ++b + c++ < a++ + c++ + a++ - ++b;
		System.out.println(d);
		
		int a1=24;
		int b1=20;
		int c1=11;
		boolean d1=a1++ + b1++ < c1++ - ++a1 + ++b1 || a1++ - ++b1 + c1++ < a1++ + c1++ + a1++ - ++b1;
		System.out.println(d1);
		

	}

}
