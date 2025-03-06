package Inheritance;

public class Traditional extends Women{
	String dress = "Saree";
	void color() {
		System.out.println("Black");
	}

	public static void main(String[] args) {
		Traditional t = new Traditional();
		System.out.println(t.dress);
		t.color();
		System.out.println(t.Categery);
		t.fit();
		

	}

}
