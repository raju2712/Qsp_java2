package com;

import java.util.Scanner;

public class Ivadopu 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("how many times you want to loop");
		int repeat=s.nextInt();
		for(int x=1;x<=repeat;x++)
		{
			System.out.println("Enter 1 for even No.");
			System.out.println("Enter 2 for even No.");
			System.out.println("Enter 3 for even No. in reverse");
			System.out.println("Enter 4 for even No. reverse");
		int choice = s.nextInt();	
		switch (choice)
				{
		case 1 :System.out.println("Enter 1st No.");
		        int y=s.nextInt();
		        System.out.println("Enter last No.");
		        int z=s.nextInt();
		        int i;
		        for(i=y;i<=z;i++)
		        {
		        	if(i%2==0)
		        	{
		        		System.out.println(i);
		        	}
		        }
		        break;
		case 2:System.out.println("Enter 1st No.");
		       int y1=s.nextInt();
		       System.out.println("Enter last No.");
		       int z1=s.nextInt();
		       int i1;
		       for(i1=y1;i1<=z1;i1++)
		       {
		    	   if(i1%2==1)
		    	   {
		    		System.out.println(i1);
		    	   }
		       }
		       break;
		case 3:System.out.println("Enter the last No.");
		       int y2=s.nextInt();
		       System.out.println("Enter the 1st No.");
		       int z2=s.nextInt();
		       int i2;
		       for(i2=y2;i2>=z2;i2--)
		       {
		    	   if(i2%2==0)
		    	   {
		    		   System.out.println(i2);
		    	   }
		       }
		       break;
		case 4:System.out.println("Enter the last No.");
		       int y3=s.nextInt();
		       System.out.println("Enter the 1st No.");
		       int z3=s.nextInt();
		       int i3;
		       for(i3=y3;i3>=z3;i3--)
		       {
		    	   if(i3%2==1)
		    	   {
		    		   System.out.println(i3);
		    	   }
		       }
	           break;
	   default :System.out.println("Invalid");        
				}
		}
		

	}

}
