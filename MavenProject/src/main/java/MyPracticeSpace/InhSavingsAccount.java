//Write a Java program to create a class known as "BankAccount"
//with methods called deposit() and withdraw(). Create a subclass 
//called SavingsAccount that overrides the withdraw() method to prevent
//withdrawals if the account balance falls below one hundred.



package MyPracticeSpace;

public class InhSavingsAccount extends InhBankAccount {
	
	int balance;
	public void withdraw(int balance) 
	{
		super.withdraw();
		super.deposit();
	    this.balance=balance;
		
		if(balance<100) 
		{
			System.out.println("Insufficient Balance, Not able to withdraw");
		}
		
		else
		{
			System.out.println("Success Transaction");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InhSavingsAccount obj=new InhSavingsAccount();
		obj.withdraw(20);
		
		
		
	}

}
