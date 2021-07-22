//JAVA Assignment Day 3 Question 2 by Pradnya Ghadge

import java.util.*;
import javax.swing.text.html.HTMLDocument.Iterator;

public class JavaAssignmentDay3Q2 {
	public static void main(String[] args) {
		
		AccountJ.setBankName("SBI");
		
		AccountJ a1 = new AccountJ(1234, 5000.00f,"password");
		AccountJ a2 = new AccountJ(5678, 6000.00f,"passwo11");
		AccountJ a3 = new AccountJ(9101, 9000.00f,"passw222");
		AccountJ a4 = new AccountJ(1121, 2000.00f,"pass3333");
		AccountJ a5 = new AccountJ(3141, 8000.00f,"exercis33");
		
		InMemoryAccountDaoImpl imad = new InMemoryAccountDaoImpl();
		imad.addAnAccount(a1);
		imad.addAnAccount(a2);
		imad.addAnAccount(a3);
		imad.addAnAccount(a4);
		imad.addAnAccount(a5);
		imad.checkBalance();
		imad.withdraw(1234, 1000.00);
		imad.withdraw(1234, 10000.00);
		imad.withdraw(1224, 1000.00);
		imad.checkBalance();

        List<AccountJ> la = imad.viewAllAccounts();
        java.util.Iterator<AccountJ> ia = la.iterator();
        while(ia.hasNext()){
            ia.next().displayAccount();
        }
        imad.changePassword(1234, "sjqwdhw", "dwidhqwihd");
        imad.changePassword(1234, "password", "dwidhqwihd");
	}

}

class AccountJ
{
	int accountNo;
	double accountBalance;
	String accountPassword;
	private static String bankName;
	
	
	static void setBankName(String bankN)
	{
		bankName = bankN;
	}
	
	AccountJ()
	{
		
	}
	AccountJ(int accountNo, double accountBalance, String accountPassword)
	{
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountPassword = accountPassword;
		
	}
	protected void setbankName(String bankName)
	{
		this.bankName = bankName;
	}
	
	protected String getbankName()
	{
		return bankName;
	}
	
	protected int getAccountNo() {
		return accountNo;
	}
	protected void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	protected double getAccountBalance() {
		return accountBalance;
	}
	protected void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	protected String getAccountPassword() {
		return accountPassword;
	}
	protected void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	
	void displayAccount()
	{
		System.out.println("------------------WELCOME TO " + bankName + " ---------------------");
		System.out.println("Account Number : "+ accountNo);
		System.out.println("Account Balance: "+ accountBalance);
	}
	
}


interface AccountDao{
	
	void addAnAccount(AccountJ account);
	void withdraw(int accountNumber,double amount);
	void checkBalance();
	void changePassword(int accountNumber,String oldPassword,String newPassword);
	List<AccountJ> viewAllAccounts();
	void getAccountDetails(int accountNumber);
}


class InMemoryAccountDaoImpl implements AccountDao
{
	List<AccountJ> accList = new ArrayList<AccountJ>();
	public void addAnAccount(AccountJ account)
	{
		System.out.println("Adding..");
		accList.add(account);
	}
	
	public void withdraw(int accountNumber,double amount)
	{
		boolean flag = false;
		boolean flagacc = false;
		
		java.util.Iterator<AccountJ> accIterator = accList.iterator();
		while(accIterator.hasNext())
		{
			AccountJ curAcc = accIterator.next();
			if(curAcc.accountNo == accountNumber)
			{
				flagacc=true;
				if(curAcc.accountBalance>0)
				{
					System.out.println("Withdrawing..");
				curAcc.accountBalance = curAcc.accountBalance-amount; 
				flag = true;
				}
				
			}
		}
		
		if(!flagacc)
			System.out.println("Account not found!");
		

		if(!flag)
			System.out.println("Insufficient balance");
	}
	
	
	public void checkBalance()
	{
		java.util.Iterator<AccountJ> myIt = accList.iterator();
		while(myIt.hasNext())
		{
		AccountJ myAc = myIt.next();
		System.out.println("The balance from Account Number "+myAc.accountNo +" is " + myAc.accountBalance);
		}
		
	}
	
	public void changePassword(int accountNumber,String oldPassword,String newPassword)
	{
		java.util.Iterator<AccountJ> myIt = accList.iterator();
		boolean flag = false;
		while(myIt.hasNext())
		{
		    AccountJ curAcc = myIt.next();
		    
			if(curAcc.accountNo == accountNumber && curAcc.accountPassword==oldPassword)
			{ 
				curAcc.accountPassword = newPassword;
				flag = true;
				System.out.println("Password reseted");
			}
			else
			{
				System.out.println("Please enter correct login details");
				flag=true;
			}
		}

		if(!flag)
			System.out.println("Account not found");
	
	}
	
	public List<AccountJ> viewAllAccounts()
	{
		
		return accList;
		
	}

	public void getAccountDetails(int accountNumber)
	{
		java.util.Iterator<AccountJ> myIt = accList.iterator();
		boolean flag = false;
		while(myIt.hasNext())
		{
		    AccountJ curAcc = myIt.next();
		    if(curAcc.accountNo==accountNumber)
		    {
		    	flag = true;
		    	curAcc.displayAccount();
		    }
			
		}
		if(!flag)
			System.out.println("Account not found");
	}
	
}