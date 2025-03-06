package com;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Even No");
		System.out.println("Enter 1st No.");
		int i=s.nextInt();
		System.out.println("Enter last No.");
		int j=s.nextInt();
		while (i<=j)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
       System.out.println("Odd No");
       System.out.println("Enter 1st No.");
       int k=s.nextInt();
       System.out.println("Enter Last No.");
       int l=s.nextInt();
       while (k<=l)
       {
    	   if(k%2==1)
    	   {
    		   System.out.println(k);
    	   }
    	   k++;
       }
      System.out.println("Even No. in reverse");
      System.out.println("Enter Last No.");
      int m=s.nextInt();
      System.out.println("Enter 1st No.");
      int n=s.nextInt();
      while (m>=n)
      {
    	  if(m%2==1)
    	  {
    		  System.out.println(m);
    	  }
    	  m--;
      }
	System.out.println("Odd No. in reverse");
	System.out.println("Enter Last No.");
	int o=s.nextInt();
	System.out.println("Enter 1st No.");
	int p=s.nextInt();
	while (o>=p)
	{
		if(o%2==1)
		{
			System.out.println(o);
		}
		o--;	
		}
	}
}
