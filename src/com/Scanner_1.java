package com;

import java.util.Scanner;

public class Scanner_1 {

	public static void main(String[] args) {
		//OBJECT CREATION
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 'a' Number");
		int a=s.nextInt();
		
		System.out.println("Enter 'b' Number");
        int b=s.nextInt();
        
        int c=a+b;
        System.out.println(c);
        
        //Scanner Creation
        Scanner P =new Scanner(System.in);
        System.out.println("Testing");
        
        System.out.println("d value");
        int d=P.nextInt();
        System.out.println("e value");
        int e=P.nextInt();
        System.out.println("f value");
        int f=P.nextInt();
        System.out.println("g value");
        int g=P.nextInt();
        System.out.println("Adittion of all variable = "+(a+b+c+d+e+f+g));
       
        //------------------------------------------------------------------------
        
        Scanner read=new Scanner(System.in);
        System.out.println("Enter Number ");	
        int num=read.nextInt();
        for(int i=1;i<=num;i++)
        {
        	if(i%3==0 && i%5==0)
        		System.out.println("FizzBuzz");
        	else if(i%3==0)
        		System.out.println("Fizz");
        	else
        		System.out.println("Invalid");
        }
        read.close();
	}
}
