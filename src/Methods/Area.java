package Methods;

import java.util.Scanner;

public class Area {
	
	static void AreaOfTriangle(int a,int b)
	{
		double half = 0.5;
		double area=half*a*b;
		System.out.println(area);
	}
	static void AreaOfCircle(int r)
	{
		double area_c=3.141*r*r;
		System.out.println(area_c);
	}
	static void AreaOfSquare(int c)
	{
		int area_s=c*c;
		System.out.println(area_s);
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Area of Triangle");
		System.out.println("enter 'a' value");
		int a=s.nextInt();
		System.out.println("enter 'b' value");
		int b=s.nextInt();
		Area.AreaOfTriangle(a, b);
		
		System.out.println("Area of Circle");
		System.out.println("enter 'r' value");
		int r=s.nextInt();
		Area.AreaOfCircle(r);
		
		System.out.println("Area of Square");
		System.out.println("enter 'c' value");
		int c=s.nextInt();
		Area.AreaOfSquare(c);

	}
}
