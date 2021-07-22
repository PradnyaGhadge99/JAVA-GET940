import java.util.Scanner;

public class JavaAssignmentDay3Q1 {

	public static void main(String[] args) {
		AccountE ae = new AccountE("Jayesh",5000.00f);
		ae.dispBal();
		ae.withdrawE();
		ae.dispBal();
	}
}

class InvalidAmountException extends RuntimeException
{
	InvalidAmountException(String str)
	{	
		super(str);
	}

}
class InsufficientFundException extends RuntimeException
{
	InsufficientFundException(String str)
	{	
		super(str);
	}

}


class AccountE
{
	String accHolder;
	float accBal;
	AccountE(String aH, float aB)
	{
		this.accHolder = aH;
		this.accBal = aB;
	}
	
	void dispBal()
	{
		System.out.println("Your current account balance is "+accBal);
	}
	
	Scanner sc = new Scanner(System.in);
	void withdrawE()
	{
		int am;
		try
		{
		System.out.println("Enter the amount you wish to withdraw: ");
		am = sc.nextInt();
		if(am<0)
		{
			InvalidAmountException iae = new InvalidAmountException("Invalid amount entered!");
			throw iae;
		}
		else {
			
			System.out.println("Withdrawing "+ am + " from account.");
			if(accBal<am)
			{
				InsufficientFundException ife = new InsufficientFundException("Oops! Insufficient Balance:(");
				throw ife;
			}
			else
			{
				accBal = accBal-am;
			}
		}
		
		
		}
		catch(InvalidAmountException e)
		{
			System.out.println(e.getMessage());
			
		}
		catch(InsufficientFundException e1)
		{
			System.out.println(e1.getMessage());
		}
	}
		
	
}