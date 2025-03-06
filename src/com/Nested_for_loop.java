package com;

import java.util.Scanner;

public class Nested_for_loop 
{
	public static void main(String[] args) 
	{                                              
		for (int i=1;i<=5;i++)        //ROW
		{
			for(int j=1;j<=1;j++)        //COLUMN
			{
				System.out.println("*");
			}
		}
		System.out.println( ); 
		//-------------------------------------------------------
		for (int k=1;k<=5;k++)
		{
			for (int l=1;l<=2;l++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		//----------------------------------------------------------	
		for (int m=1;m<=5;m++)
		{
			for (int n=1;n<=3;n++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		//--------------------------------------------------------------
		for (int o=1;o<=5;o++)
		{
			for(int p=1;p<=4;p++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		//------------------------------------------------------------------		
		for (int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				if(r==1 || c==4 || r==c)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();		
		//-------------------------------------------------------------------------
		for (int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				if(r==4 || c==1 || r==c)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//---------------------------------------------------------------------------
		for (int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				if(r==4 || c==1 || r+c==5)
				{
					System.out.print("2 ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//-------------------------------------------------------------------------
		for (int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				if(r==1 || r==4 || c==1 || c==4)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//--------------------------------------------------------------------------
		for (int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				if(r==1 || c==4 || r+c==5)
				{
					System.out.print("2 ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//--------------------------------------------------------------------------
		for (int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				if(r==1 || c==1 || r==c)
				{
					System.out.print("2 ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//-------------------------------------------------------------------------
		for (int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				if(r==1 || r==4 || r+c==5)
				{
					System.out.print("Z ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//-------------------------------------------------------------------------------
		for (int r=1;r<=5;r++)
		{
			for(int c=1;c<=4;c++)
			{
				if(r==1 || r==3 || r==5 || r+c==3 || r+c==8)
				{
					System.out.print("5 ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();	
		//-----------------------------------------------------------------------------------
		for (int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.print(r +" ");
			}
			System.out.println();
		}
		System.out.println();
		//--------------------------------------------------------------------------------------
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=n;c++)
			{
				if(r==1 || c==1 || r==n || c==n)
				{
					System.out.print(c +" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		//-----------------------------------------------------------------------------------------
		Scanner q=new Scanner(System.in);
		System.out.println("Enter a number");
		int w=q.nextInt();
		for(int r=1;r<=w;r++)
		{
			for(int c=1;c<=w;c++)
			{
				if(r==1 || c==1 || r==w || c==w || r==c || r+c==(w+1))
				{
					System.out.print(r +" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		//---------------------------------------------------------------------------------------------
		Scanner e=new Scanner(System.in);
		System.out.println("Enter a number");
		int t=e.nextInt();
		for(int r=1;r<=t;r++)
		{
			for(int c=1;c<=t;c++)
			{
				if( r==c || r+c==(t+1) )
				{
					System.out.print(r +" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		//-----------------------------------------------------------------------------------------------
		Scanner y=new Scanner(System.in);
		System.out.println("Enter a number");
		int u=y.nextInt();
		for(int r=1;r<=u;r++)
		{
			for(int c=1;c<=u;c++)
			{
				if( r==c || r+c==(u+1) )
				{
					System.out.print(c +" ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//------------------------------------------------------------------------------------------------
		for (int r=1;r<=5;r++)
		{
			for(int c=1;c<=7;c++)
			{
				if(r==1&&c==2 || r==1&&c==3 ||r==1&&c==5 || r==1&&c==6 || r==2&&c==1 || r==2&&c==4 ||r==2&&c==7 || r==3&&c==2 || r==3&&c==6 || r==4&&c==3||r==4&&c==5 || r==5&&c==4 )
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//-----------------------------------------------------------------------------------------------------
		for (int r=1;r<=5;r++)
		{
			for(int c=1;c<=7;c++)
			{
				if(r==1&&c==2 || r==1&&c==3 ||r==1&&c==5 || r==1&&c==6 || r==2&&c==1 || r==2&&c==4  || r==3&&c==2 || r==4&&c==3 || r+c==9 )
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println(); 
		//-------------------------------------------------------------------------------------------------------
		Scanner f=new Scanner(System.in);
		System.out.println("Enter a number");
		int d=f.nextInt();
		for(int r=1;r<=d;r++)
		{
			for(int c=1;c<=d;c++)
			{
				if(c==1 || c==3)
				{
					System.out.print(1 +" ");
				}
				else
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
		//--------------------------------------------------------------------------------------------------------
		Scanner h=new Scanner(System.in);
		System.out.println("Enter a number");
		int j=h.nextInt();
		for(int r=1;r<=j;r++)
		{
			for(int c=1;c<=j;c++)
			{
				if(r==2 || r==4)
				{
					System.out.print(0 +" ");
				}
				else
				{
					System.out.print("1 ");
				}
			}
			System.out.println();
		}
	}
}


