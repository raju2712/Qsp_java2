package Methods;

public class A {       //STATIC BLOCK
	static int a;
	static int b;
	static int c;
	
	static {
		a=10;
		System.out.println(1);
	}
	static {
		b=20;
		System.out.println(2);
	}
	static {
		a=30;
		System.out.println(3);
	}
	static {
		b=40;
		System.out.println(4);
	}
	static {
		a=50;
		System.out.println(5);
	}
	static {
		b=50;
		System.out.println(6);
	}
	static {
		a=60;
		System.out.println(7);
	}

	public static void main(String[] args) {
		System.out.println(A.a);
		c=100;
		System.out.println(A.b);
        c=200;
        System.out.println(A.c);
	}

}
