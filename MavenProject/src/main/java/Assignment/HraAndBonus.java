// program to find the total salary of an employee
//class -1-- get basic pay, deductions and bonus from console 
//class - 2--Calculate hra(5% of basic pay) and pf(20% of basic pay)
// class-3--find the total salary (basic pay+hra-pfadeduction+bonus)and get the salary slip
//salary slip should contain :- basic pay deduction.hra, pf ,bonus and total salary by hand 


package Assignment;

public class HraAndBonus extends InheritanceBasicPay {

	 int hra;
	 int pf;
	
	public void bonusAndhra(int hra, int pf) 
	{
		this.hra=hra;
		this.pf=pf;
	}

	public void cal() {
	int hra =(basicpay*5)/100;
	int pf= (basicpay*20)/100;
		
System.out.println("hra amount="+" "+hra);
System.out.println("PF amount="+" "+pf);
	}
	
		
	public static void main(String args[]) 
	{
		HraAndBonus obj = new HraAndBonus();
	
obj.basic(100, 20, 30);
obj.cal();
				
				
	}
}
