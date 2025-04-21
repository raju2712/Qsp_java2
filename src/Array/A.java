package Array;

public class A {

	public static void main(String[] args) {
		
		String a = "raju";
		String b = "RAJU";
		
	/*	System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.startsWith("r"));
		System.out.println(a.endsWith("u"));
		System.out.println(a.concat(" R"));
		System.out.println(a.contains("j"));
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf(a));
		System.out.println(a.substring(1));
		System.out.println(a.substring(1, 3));
		
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));  */ 
		
		
		// Forward printing
		
	/*	for(int i=0;i<=a.length()-1;i++) 
		System.out.print(a.charAt(i));  */ 
		
		//Backward printing
		
		for(int j=a.length()-1;j>=0;j--)
			System.out.print(a.charAt(j));
	
		
		
	}

}
