// program to find the total salary of an employee
//class -1-- get basicpay, deductions and bonus from console 
//class - 2--Calculate hra(5% of basic pay) and pf(20% of basic pay)
// class-3--find the total salary (basic pay+hra-pfadeduction+bonus)and get the salary slip
//salary slip should contain :- basic pay deduction.hra, pf ,bonus and total salary by hand 


package Assignment;

public class InheritanceBasicPay {
	
	
	int basicpay;
	int deduction;
	int bonus;
	
	public void basic(int basicpay, int deduction, int bonus) 
	{
	
	this.basicpay=basicpay;
	this.deduction=deduction;
	this.bonus=bonus;
	}
}
	