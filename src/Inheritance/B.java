package Inheritance;

public class B extends A {

	static
	{
		System.out.println("nsb 2");
	}
	 
	{
		int b = 10;
		System.out.println("sb 2");
	}

	public static void main(String[] args) {
		B b = new B();
		
	}
}
