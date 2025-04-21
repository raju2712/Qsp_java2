package Methods;

import com.sun.tools.javac.Main;

public class Constructor {
	
/*	String Brand;
	double Cost;
	String RAM;
	
	Constructor (String a,double b,String c){
		Brand = a;
		Cost = b;
		RAM = c;
	}

	public static void main(String[] args) {
		Constructor c1 = new Constructor("Lenovo",10000.00,"4GB");
		Constructor c2 = new Constructor("HP",20000.00,"6GB");
		Constructor c3 = new Constructor("Acer",30000.00,"12GB");
		Constructor c4 = new Constructor("Dell",40000.00,"16GB");
		
		System.out.println(c1.Brand+" "+c1.Cost+" "+c1.RAM);
		System.out.println(c2.Brand+" "+c2.Cost+" "+c2.RAM);
		System.out.println(c3.Brand+" "+c3.Cost+" "+c3.RAM);
		System.out.println(c4.Brand+" "+c4.Cost+" "+c4.RAM);
		

	} */
//----------------------------------------------------------------------------------------------
	
	String Name;
	int Eid;
	double Sal;
	long Mno;
	
	Constructor(String a,int b,double c,long d){
		Name = a;
		Eid = b;
		Sal = c;
		Mno = d;
	}
		
	public static void main(String[] args) {
			Constructor E1 = new Constructor ("Raju",1,100.00,12345);
			Constructor E2 = new Constructor ("Hassin",2,200.00,123456);
			Constructor E3 = new Constructor ("Kamal",3,300.00,1234567);
			Constructor E4 = new Constructor ("Nithesh",4,400.00,12345678);
			Constructor E5 = new Constructor ("Bala",5,500.00,123456789);
			
			System.out.println(E1.Name+" "+E1.Eid+" "+E1.Sal+" "+E1.Mno);
			System.out.println(E2.Name+" "+E2.Eid+" "+E2.Sal+" "+E2.Mno);
			System.out.println(E3.Name+" "+E3.Eid+" "+E3.Sal+" "+E3.Mno);
			System.out.println(E4.Name+" "+E4.Eid+" "+E4.Sal+" "+E4.Mno);
			System.out.println(E5.Name+" "+E5.Eid+" "+E5.Sal+" "+E5.Mno);
		
	}
	
}
