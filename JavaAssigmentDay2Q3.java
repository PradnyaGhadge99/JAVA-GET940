//Java Assignment Day 2 Q3 by Pradnya Ghadge

public class JavaAssigmentDay2Q3 {
	public static void main(String[] args) {
		SbiAtm sb1 = new SbiAtm(2009182762, 2000.00, "@PASSword");
		sb1.checkBalance();
		sb1.changePassword(2009182762, "dkdwj", "HI");
		sb1.changePassword(2009182762, "@PASSword", "HI");
		sb1.withdraw(2009182762, 100.00);
		sb1.checkBalance();
	}
	

}

interface ATM
{
	void withdraw(int accountNumber,double amount);
	void changePassword(int accountNumber,String oldPassword,String newPassword);
	void checkBalance();
}

class SbiAtm implements ATM
{
	int accounNumber;
	double balance;
	String password;
	
	SbiAtm(int accNo, double bal, String pass)
	{
		this.accounNumber=accNo;
		this.balance=bal;
		this.password=pass;
	}
	
	
	public void withdraw(int accountNumber,double amount)
	{
		if(balance != 0)
		{
			balance = balance - amount;
		}
		else
			System.out.println("Oops! Insufficient Balance:(");
		
	}
	public void changePassword(int accountNumber,String oldPassword,String newPassword)
	{
		if(password == oldPassword)
			{
			password = newPassword;
			System.out.println("Your new password "+password + " is set succesfully.");
			}
		else
			System.out.println("Your old password is incorrect.");
		
	}
	public void checkBalance()
	{
		System.out.println("Your current balance is "+ balance);
		
	}
	
}

class IciciAtm implements ATM
{
	int accounNumber;
	double balance;
	String password;
	
	IciciAtm(int accNo, float bal, String pass)
	{
		this.accounNumber=accNo;
		this.balance=bal;
		this.password=pass;
	}
	
	
	public void withdraw(int accountNumber,double amount)
	{
		if(balance != 0)
		{
			balance = balance - amount;
		}
		else
			System.out.println("Oops! Insufficient Balance:(");
		
	}
	public void changePassword(int accountNumber,String oldPassword,String newPassword)
	{
		password = newPassword;
		
	}
	public void checkBalance()
	{
		System.out.println("Your current balance is "+ balance);
		
	}
	

}