package exceptions;

public class arithmaticexceptio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=10;
		int b=0;
try {
		int c =a/b;
		System.out.println(c);
		}
		
		/*catch(ArithmeticException q) 
       {
			System.out.println("Error occured");
			}*/
finally {
	System.out.println("Thank you");
}
	}

}
