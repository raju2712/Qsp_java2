package Exception;

public class A {

	public static void main(String[] args) {
		
		int [] a = {1,2,3,4,5};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		try 
		{
		System.out.println(a[5]);
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
		}
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println("-------------------------------------------------------------------------");
		
		int [] b = {1,2,3,4,5};
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		try 
		{
		System.out.println(b[5]);
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println(b[3]);
		System.out.println(b[4]);
		

	}

}
