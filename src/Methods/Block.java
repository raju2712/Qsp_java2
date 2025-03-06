package Methods;

public class Block {
	
	static int a;     //Declaring variable
	static {
		System.out.println("Hi");
		a=10;        //Initializing variable
		System.out.println(Block.a);
    }

	public static void main(String[] args) {
	    a=50;
		System.out.println(Block.a);
	}
	
	static {
		System.out.println("Hii");
		a=20;
		System.out.println(Block.a);
	}
}
