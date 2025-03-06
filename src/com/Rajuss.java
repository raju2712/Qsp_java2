package com;

public class Rajuss {

	public static void main(String[] args) {
		
		
		
		
		   /*     int r = 7; // Height of each letter pattern
		        int c = 5;  // Width of each letter pattern

		        // Loop through each row
		        for (int i = 0; i < r; i++) {
		            // Print letter R
		            for (int j = 0; j < c; j++) {
		                if (j == 0 || (i == 0 && j < c - 1) || (i == r / 2 && j < c - 1) || (j == c - 1 && i < r / 2) || (i - j == r / 2 - 1 && j > 0 && j < c - 1)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }

		            // Space between letters
		            System.out.print(" ");

		            // Print letter A
		            for (int j = 0; j < c; j++) {
		                if ((i == 0 && j > 0 && j < c - 1) || (j == 0 && i > 0) || (j == c - 1 && i > 0) || (i == r / 2 && j > 0 && j < c - 1)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }

		            // Space between letters
		            System.out.print(" ");

		            // Print letter J
		            for (int j = 0; j < c; j++) {
		                if ((j == c / 2 && i > 0) || (i == r - 1) || (i == r - 2 && j <= c / 2)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }

		            // Space between letters
		            System.out.print(" ");

		            // Print letter U
		            for (int j = 0; j < c; j++) {
		                if ((j == 0 && i < r - 1) || (j == c - 1 && i < r - 1) || (i == r - 1 && j > 0 && j < c - 1)) {
		                    System.out.print("* ");
		                } else {
		                    System.out.print("  ");
		                }
		            }

		            // Move to the next line
		            System.out.println();
		        } */
//-----------------------------------------------------------------------------------------------------------------------------------------------
		        for (int r=1;r<=7;r++)
				{
					for(int c=1;c<=20;c++)
					 {
						if(r==1&&c==1||r==1&&c==2||r==1&&c==3||r==1&&c==4||r==1&&c==5||r==1&&c==7||r==1&&c==8||r==1&&c==9||r==1&&c==11||r==1&&c==12||r==1&&c==13||r==1&&c==14||r==1&&c==15||r==1&&c==16||r==1&&c==20||r==2&&c==1||r==2&&c==5||r==2&&c==6||r==2&&c==10||r==2&&c==13||r==2&&c==16||r==2&&c==20||r==3&&c==1||r==3&&c==5||r==3&&c==6||r==3&&c==10||r==3&&c==13||r==3&&c==16||r==3&&c==20||r==4&&c==1||r==4&&c==2||r==4&&c==3||r==4&&c==4||r==4&&c==5||r==4&&c==6||r==4&&c==7||r==4&&c==8||r==4&&c==9||r==4&&c==10||r==4&&c==13||r==4&&c==16||r==4&&c==20||r==5&&c==1||r==5&&c==2||r==5&&c==6||r==5&&c==10||r==5&&c==13||r==5&&c==16||r==5&&c==20||r==6&&c==1||r==6&&c==4||r==6&&c==6||r==6&&c==10||r==6&&c==13||r==6&&c==16||r==6&&c==20||r==7&&c==1||r==7&&c==5||r==7&&c==6||r==7&&c==10||r==7&&c==11||r==7&&c==12||r==7&&c==13||r==7&&c==17||r==7&&c==18||r==7&&c==19)
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
		    }
		}
