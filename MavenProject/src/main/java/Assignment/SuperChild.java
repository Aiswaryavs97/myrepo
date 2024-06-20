package Assignment;

//program to check the addition resule it divisible by 10
//class 1 - return addition result of two numbers 
//Clss - 2 - check the addition result is divisibe by 10
//use superkyword

public class SuperChild extends  SuperParent{
	
	
	public int display() 
	
	{
		c=c%10;
	
		super.addition(11, 5);
		if(c==0) 
		{
			System.out.println("divisible by 10 ");
		}
		else 
		{
			System.out.println("not divisible by 10");
		}
		return c;}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperChild obj=new SuperChild();
		obj.display();
		
	
		
	}

}
