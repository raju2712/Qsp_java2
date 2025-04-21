package Exception;

public class Throw {

	public static void main(String[] args) {
		
		int bal = 20000;
		int wdl_amt = 80000;
		if(wdl_amt <= bal) 
		{
			bal=bal-wdl_amt;
			System.out.println("Withdrawal is successful and available balance is "+bal);
		}
		else
		{
			try 
			{
				throw new AvlBal("Insufficient balance");
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		}	
	}
}

class AvlBal extends Exception
{
			private String message;
			AvlBal (String message)
			{
				this.message=message;
			}
			public String getMessage()
			{
				return message;
			}
}
