package Exception;

public class B {

	public static void main(String[] args) {
		
		int[]a= {1,2,3,4,5};
		try {
			try {
				System.out.println(a[100]);
			    }
		    catch(Exception e) 
		    	{
		    	System.out.println(e.getMessage());
		        }
			System.out.println(10/0);
			}
		catch(Exception e) 
		    {
			System.out.println(e.getMessage());
		    }

	}

}
