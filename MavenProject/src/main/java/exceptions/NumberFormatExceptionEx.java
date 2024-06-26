package exceptions;

public class NumberFormatExceptionEx 
    {

		public static void main(String[] args) 
		{
		
			String age ="Aiswarya";
			try
			{
				int num=Integer.parseInt(age);
				System.out.println("age is = "+num);
			}
			catch(NumberFormatException a)
			{
				System.out.println("Exception occured");
			}
	finally
	{
		System.out.println("Finally statement");
	}
		}

	}


