package Methods;

public class Cc {
	
	Cc(){
		this(27,"Jan");                   //this will call (int a,string b)
		System.out.println("2000");
	}
   Cc(int a){                             //this will call ()
		System.out.println("27");
	}
   Cc(int a,String b){
	   this(2000);                        //this will (int a)
	   System.out.println("JAN");
    }	
	public static void main(String[] args) {
    Cc c = new Cc();
	}
}
