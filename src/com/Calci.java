package com;

import java.util.Scanner;

public class Calci {

	public static void main(String[] args) 
	{
		//addition using Scanner
		Scanner A = new Scanner(System.in);    //Scanner Creation
		System.out.println("'a' value");
		int a = A.nextInt();
		System.out.println("'b' value");
		int b = A.nextInt();
		System.out.println("Adittion of 'a+b' "+ (a+b));
		
		//subraction
		int c=30;
		int d=40;
		int e=(c-d);
		System.out.println("Subraction of c & d is " +e);
		
		//multipilication
		int f=50;
		int g=60;
		int h=(f*g);
		System.out.println("Multipilication of g & g is "+h);
		
		//division
		int i=70;
		int j=80;
		float k=(i/j);
		System.out.println("Division of i & j is "+k);
		}
}
