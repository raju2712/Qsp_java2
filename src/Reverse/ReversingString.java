package Reverse;

public class ReversingString {

	public static void main(String[] args) {
		
		String s = "RAJU";
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		System.out.println(sb.toString());
		
		//--------------------------------------

		String a ="Malayalam";
		String rev="";
		for(int i=a.length()-1 ; i>=0 ; i--) {
			rev+=a.charAt(i);
		}
		System.out.println(rev);
		
	}

}
