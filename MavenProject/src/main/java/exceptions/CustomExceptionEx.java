package exceptions;

public class CustomExceptionEx {
	
	public void display(int age) throws InvalidException 
	{
		if(age<18) 
		{
			throw new InvalidException("Invalid age ");
		}

		else {
			System.out.println("Valid age");
		}
		
	}

	public static void main(String[] args) throws InvalidException {
		
		CustomExceptionEx obj=new CustomExceptionEx();
		obj.display(2);
		
	}

}
