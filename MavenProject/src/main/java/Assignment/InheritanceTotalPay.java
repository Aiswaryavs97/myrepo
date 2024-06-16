// program to find the total salary of an employee
//class -1-- get basicpay, deductions and bonus from console 
//class - 2--Calculate hra(5% of basic pay) and pf(20% of basic pay)
// class-3--find the total salary (basic pay+hra-pf-deduction+bonus)and get the salary slip
//salary slip should contain :- basic pay deduction.hra, pf ,bonus and total salary by hand 



package Assignment;

public class InheritanceTotalPay extends HraAndBonus  {

	int salaryslip;
	
	public void totalsalary() 
	{
		int total=(basicpay+hra-pf-deduction+bonus);
		
		
		System.out.println("total pay="+" "+total);
		
		salaryslip= (basicpay+deduction+hra+pf+bonus+total);
		System.out.println("salaryslip="+" "+salaryslip);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritanceTotalPay obj2=new InheritanceTotalPay();
		obj2.basic(100, 20, 30);
		obj2.cal();
		obj2.totalsalary();
	}

}
