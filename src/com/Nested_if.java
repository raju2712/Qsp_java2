package com;

public class Nested_if {

	public static void main(String[] args) {
		int mob=787168;
		int pass=12345;
		
		if(mob==787168)
		{
			if (pass==12345)
			{
			System.out.println("login1");
			}
			else
			{
				System.out.println("Wrong");
			}
		}
		else
		{
			System.out.println("Wrong credentails");
		}
		
		//-----------------------------------------------------------------------------
		
		String email="rajuramikpm@gmail.com";
		String password="Raju@123";
		
		if(email=="rajuramikpm@gmail.com")
		{
			if(password=="Raju@1234")
			{
				System.out.println("Sucess2");
			}
			else
			{
				System.out.println("Wrong Password");
			}
		}
		else
		{
			System.out.println("Wrong emailid");
		}
	}
}
