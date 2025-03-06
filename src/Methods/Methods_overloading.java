package Methods;

import java.util.Scanner;

public class Methods_overloading{

	static void login(String email,String pass) 
	{
		if(email.equals("raju@2712")) 
		{
			if(pass.equals("2712@2712")) 
			{
				System.out.println("logged in");
			}
			else 
			{
				System.out.println("wrong password");
			}
		}
		else 
		{
			System.out.println("Wrong email");
		}}
	//-----------------------------------------------------------------------------		
	static void login(long mno,String pass1) 
	{
		if(mno==7871684605l) 
		{
			if(pass1.equals("2712@2712")) 
			{
				System.out.println("logged in");
			}
			else 
			{
				System.out.println("wrong password");
			}
		}
		else 
		{
			System.out.println("Wrong mno");
		}}
	//-------------------------------------------------------------------------------
	static void login(int uid,String pass2) 
	{
		if(uid==78716) 
		{
			if(pass2.equals("2712@2712")) 
			{
				System.out.println("logged in");
			}
			else 
			{
				System.out.println("wrong password");
			}
		}
		else 
		{
			System.out.println("Wrong uid");
		}}
	//----------------------------------------------------------------------------------			
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("how many times you need the loop");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) 
		{
			System.out.println("enter ur choice");
			int choice =s.nextInt();
			switch (choice) 
			{
			case 1 : System.out.println("enter ur email");
			String email=s.next();
			System.out.println("enter ur pass");
			String pass =s.next();
			Methods_overloading.login(email, pass);
			break;

			case 2 : System.out.println("enter ur mno");
			long mno=s.nextLong();
			System.out.println("enter ur pass");
			String pass1 =s.next();
			Methods_overloading.login(mno, pass1);
			break;  

			case 3 : System.out.println("enter ur uid");
			int uid=s.nextInt();
			System.out.println("enter ur pass");
			String pass2 =s.next();
			Methods_overloading.login(uid, pass2);
			break;

			default: System.out.println("Invalid Details");       
			}
		}
	}
}
