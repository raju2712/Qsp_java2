package Polymorphism;

public class Insta1 {

	public static void main(String[] args) {
	/*	Insta1 i = new Insta1();
		i.login();   */
	}
	
	void login()
	{
		System.out.println("login success");
	}

}

class Insta2 extends Insta1 {
	
	void login()
	{
		int mno = 123;
		int pass = 456;
		
		if(mno == 123) 
		{
			if(pass == 456) 
			{
				System.out.println("login success");
			}
			else 
			{
				System.out.println("wrong pass");
			}
		}
		else 
		{
		   System.out.println("wrong mno");	
		}
	}
}

class User {
	
	public static void main(String[] args) {
		Insta1 i = new Insta2();
		i.login();
	}
}
