package Methods;

import java.util.Scanner;

public class Calci {
	
	static void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	static void sub(int d,int e)
	{
		int f=d-e;
		System.out.println(f);
	}
	static void mul(int g,int h)
	{
		int v=g*h;
		System.out.println(v);
	}
	static void div(int j,int k)
	{
		int l=j/k;
		System.out.println(l);
	}
	static void mod(int m,int n)
	{
		int o=m%n;
		System.out.println(o);
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("how many times to loop");
		
		int x=s.nextInt();
		
		for(int i=1;i<=x;i++)
		{
			System.out.println("which method");
			int method =s.nextInt()	;
			
			switch(method)
			{
			case 1 : System.out.println("enter 'a' value");
			         int a=s.nextInt();
			         System.out.println("enter 'b' value");
			         int b=s.nextInt();
			         Calci.add(a, b);
			         break;
			         
			case 2 : System.out.println("enter 'd' value");
	                 int d=s.nextInt();
	                  System.out.println("enter 'e' value");
	                  int e=s.nextInt();
	                  Calci.sub(d, e);
	                  break;
	         
			case 3 : System.out.println("enter 'g' value");
	                 int g=s.nextInt();
	                 System.out.println("enter 'h' value");
	                 int h=s.nextInt();
	                 Calci.mul(g, h);
	                 break;
	         
			case 4 : System.out.println("enter 'j' value");
	                 int j=s.nextInt();
	                 System.out.println("enter 'k' value");
	                 int k=s.nextInt();
	                 Calci.div(j, k);
	                 break;
	         
			case 5 : System.out.println("enter 'm' value");
	                 int m=s.nextInt();
	                 System.out.println("enter 'n' value");
	                 int n=s.nextInt();
	                 Calci.mod(m, n);
	                 break;
	         
	       default : System.out.println("Invalid method");
	         
			}
		}
	}
}
