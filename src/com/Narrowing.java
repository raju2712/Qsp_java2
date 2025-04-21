package com;

public class Narrowing {

	public static void main(String[] args) 
	{
		//1
		byte a=20;
		double b=(double)a;
		System.out.println(a);
		System.out.println(b);
		//2
		double c=132.48;
		byte d=(byte)c;
		System.out.println(c);
		System.out.println(d);
		//3
		int e=99;
		char f=(char)e;
		System.out.println(e);
		System.out.println(f);
		//4
		double g=111.12345678;
		char h=(char)g;
		System.out.println(g);
		System.out.println(h);
		//5
		int i=130;
		byte j=(byte)i;
		System.out.println(i);
		System.out.println(j);
		//6
		short k=97;
		char l=(char)k;
		System.out.println(k);
		System.out.println(l);
		//7
		char m='D';
		short n=(short)m;
		System.out.println(m);
		System.out.println(n); 
		


	}

}
