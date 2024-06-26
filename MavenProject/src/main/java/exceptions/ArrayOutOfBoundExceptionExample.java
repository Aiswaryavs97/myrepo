package exceptions;

public class ArrayOutOfBoundExceptionExample {

	public static void main(String[] args) {
		
		int array[]=new int [6];
		
		try
		{
			array[15]=100;
			
		}
catch (ArrayIndexOutOfBoundsException q)
		{
	System.out.println("exception occured ");
	
		}
		
	}

}
