package com;

public class Incremental {

	public static void main(String[] args) {
		//1
		int a=48;
		int b=51;
		int c=49;
		int d= a++ + b++ + ++a - --b + ++b - --a + ++b - --b - --a - --b + ++a + ++c - --c + ++c - --c + ++c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		//2
		int e=41;
		int f=113;
		int g=100;
		int h=111;
		int i=10+20+ e++ + f++ + g++ + h++ + --e + --f + --g + --h + ++e - --e + ++f + g++;
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		
	}

}
