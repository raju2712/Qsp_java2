package Inheritance;

public class Saree extends Traditional{
	String color = "Black";
	void Material() {
		System.out.println("cotton");
	}
	

	public static void main(String[] args) {
		Saree s = new Saree();
		System.out.println(s.color);
		s.Material();
		System.out.println(s.dress);
		s.color();
		s.fit();
		s.Status();
		System.out.println(s.Location);
		System.out.println(s.Categery );
		

	}

}
