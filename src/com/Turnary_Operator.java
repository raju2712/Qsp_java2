package com;

public class Turnary_Operator {

	public static void main(String[] args) {
		int a= 70;
		int b=20;
		String greatest= (a>b)?"a is greater":"b is greater";
		System.out.println(greatest);
		
		int height=5;
		int weight=80;
		String res=(height>=6 && weight>=60)?"Eligible":"Not Eligible";
		System.out.println(res);
		

	}

}
