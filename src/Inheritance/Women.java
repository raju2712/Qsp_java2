package Inheritance;

public class Women extends Ajio {
	String Categery = "Kurti";
	void fit() {
		System.out.println("fitted");
	}

	public static void main(String[] args) {
		Women w = new Women();
		System.out.println(w.Categery);
		w.fit();
		w.Status();
		System.out.println(w.Location);
		System.out.println(w.Pincode);
		

	}

}
