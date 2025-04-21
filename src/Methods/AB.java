package Methods;

public class AB {              //NON STATIC BLOCK
	
	
	int a;
	static int b;
	
    {
		a=10;
		System.out.println("Hi");
		b=20;
	}
	
	public static void main(String[] args) {
		
		System.out.println(AB.b);
		System.out.println("Bye");
		AB a = new AB();
		System.out.println(a.a);

	}

}
