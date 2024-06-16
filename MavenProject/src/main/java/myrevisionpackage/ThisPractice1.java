
//program to find the reverse of a number 
// two constructors, one for calculation reverse and other for 
//finding reverse
//argument variable and instance variable should be same 
//Main method allows to invoke only one constructor 



package myrevisionpackage;

public class ThisPractice1 {
	
	int number1=123456;
	  int reverse;
	public ThisPractice1(int number) 
	{
	    number1=number;
	  
	    
	    while(number>0) 
	    {
	    	int reminder =number%10;
	    	number = number%10+reminder;
	    
	    }

	    System.out.println(reverse);
	    
	}
	
	public ThisPractice1() 
	{
		
		System.out.println("finding reverse"+" "+this.reverse);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisPractice1 obj=new ThisPractice1();
		

	}

}
