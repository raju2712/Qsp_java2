package Methods;

public class This {
	
	String Brand;
	double Cost;
	String RAM;

	public This(String Brand, double Cost, String RAM)
	{
		this.Brand = Brand;
		this.Cost = Cost;
		this.RAM = RAM;
	}
	
	void show() 
	{
		System.out.println(Brand+" "+Cost+" "+RAM);
	}
		
	public static void main(String[] args) {
		This m1=new This("Poco",27000.00,"12gb");
		This m2=new This("realme",33000.00,"12gb");
		This m3=new This("apple",44000.00,"6gb");
		This m4=new This("1+",55000.00,"12gb");
		This m5=new This("samsung",22000.00,"6gb");
m1.show();
m2.show();
m3.show();
m4.show();
m5.show();
	}	
}
