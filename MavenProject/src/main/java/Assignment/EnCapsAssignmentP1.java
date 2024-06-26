package Assignment;
//program to withdraw amount from an ATM
//Class 1 bank one method to set pin from user class and 
//validate pin in another method 
//valid pins 1001,1234,1212
//pin number should be declared as private 
//class 2 user get the pin from user
public class EnCapsAssignmentP1 {
	
	private int pinNumber;
	public void getPin() 
	{
		System.out.println(pinNumber);
	}	
	public void setPin(int pinNumber) 
	{
		this.pinNumber=pinNumber;

	}
    public void display() 
    {
    	
	if (pinNumber==1001)
	{
		System.out.println("Valid Pin");
	}
	else if (pinNumber==1234)	
	{
		System.out.println("Valid Pin");
	}
	else if (pinNumber==1212)
	{
		System.out.println("Valid Pin");
	}
	else 
	{
		System.out.println("Invalid Pin");}
	}
}
