package com;

import java.util.Scanner;

public class Switch_case 
{
	public static void main(String[] args) 
	{
		int choice =4;
		switch (choice)
		{
		case 1:System.out.println("Vote for " + choice);
		break;
		case 2:System.out.println("Vote for " + choice);
		break;
		case 3:System.out.println("Vote for " + choice);
		break;
		case 4:System.out.println("Vote for " + choice);
		break;
		case 5:System.out.println("Vote for " + choice);
		break;
		case 6:System.out.println("Vote for " + choice);
		break;
		case 7:System.out.println("Vote for " + choice);
		break;
		default:System.out.println("NOTA");
		}
		
		//--------------------2--------------------------------
		
		int age = 18;
		switch (age)
		{
		case 1:int age1 =21;
			   String res=(age1>=18)?"Eligible for vote":"Not eligible for vote";
			   System.out.println(res);
			   break;
			   
		case 2:int buzz = 35;
		       if(buzz%7==0 || buzz%10==7)
		       {
		    	   System.out.println("It is buzz number");
		       }
		       else
		       {
		    	   System.out.println("It is not a buzz number");
		       }
		       break;
		       
		case 18:int amt = 78000;
		       if(amt>=15000 && amt<=20000)
		       {
		    	   System.out.println("Buy Lava");
		       }
		       else if(amt>=21000 && amt<=30000)
		       {
		    	   System.out.println("Buy Acer");
		       }
		       else if(amt>=31000 && amt<=40000)
		       {
		    	   System.out.println("Buy Lenovo");
		       }
		       else if(amt>=41000 && amt<=50000)
		       {
		    	   System.out.println("Buy Dell");
		       }
		       else if(amt>=51000 && amt<=100000)
		       {
		    	   System.out.println("Buy Apple");
		       }
		       else
		       {
		    	   System.out.println("Don't buy anything");
		       }
		       break;
		       
		case 4:int mark = 81;
		       if(mark>=40 && mark<=50)
		       {
		    	   System.out.println("F");
		       }
		       else if(mark>=51 && mark<=60)
		       {
		    	   System.out.println("E");
		       }
		       if(mark>=61 && mark<=70)
		       {
		    	   System.out.println("D");
		       }
		       if(mark>71 && mark<=80)
		       {
		    	   System.out.println("C");
		       }
		       if(mark>=81 && mark<=90)
		       {
		    	   System.out.println("B");
		       }
		       if(mark>=91 && mark<=100)
		       {
		    	   System.out.println("A");
		       }
		       else
		       {
		    	   System.out.println("Fail");
		       }
		       break;
		       
		       default : System.out.println("Invalid");    
		}  
	}
}
