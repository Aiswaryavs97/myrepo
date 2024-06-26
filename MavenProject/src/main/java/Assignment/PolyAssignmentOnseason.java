package Assignment;
//Program to calculate discount if customer purchase clothes on 
//Offseason set discount 15% and on Onseason 40%
//Should user two classes, Onseason and Offseason
//User two methods - discount(methods name should be same)

public class PolyAssignmentOnseason { 
	
	double originalprice;
	
	double discount;
	double discountpercentage;
	
	public void discountAmount(double originalprice, double discountpercentage)
	{
	
		this.originalprice=originalprice;
		this.discountpercentage=discountpercentage;
			
	}
	
	public void displaydiscount()
	{
		discount = originalprice*(discountpercentage/100);
        System.out.println("discount of Onseason 40%="+" "+discount+"$");
	}
	}

