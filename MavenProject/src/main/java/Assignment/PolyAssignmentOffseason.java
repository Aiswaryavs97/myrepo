package Assignment;
//Program to calculate discount if customer purchase clothes on 
//Offseason set discount 15% and on Onseason 40%
//Should user two classes, Onseason and Offseason
//User two methods - discount(methods name should be same)

public class PolyAssignmentOffseason extends PolyAssignmentOnseason {
	
	double discount;
	double originalprice;
	double discountpercentage;
	public void discountAmount(double originalprice, double discountpercentage)
	{
		this.discountpercentage=discountpercentage;
		this.originalprice=originalprice;
		
	}
	
	public void displaydiscount() 
	{
		super.discountAmount(10, 40);
		super.displaydiscount();
		discount = originalprice*(discountpercentage/100);
        System.out.println("discount amount of Offseason 15% ="+" "+discount+"$");		
	}
	
	public static void main(String[] args) {
		
		PolyAssignmentOffseason obj= new PolyAssignmentOffseason();
		
		obj.discountAmount(50.0, 15.0);
		obj.displaydiscount();
		
		}

}
