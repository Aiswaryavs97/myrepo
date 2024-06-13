package accessspecifier;

public class SpecifierAccess {
	
	public void display1() 
	{
		System.out.println("This is a public method");
	}
	
	private void display2() 
	{
		System.out.println("This is a private method");
	}
	protected void display3() 
	{
		System.out.println("This is a protected method");
	}
	void display4() 
	{
		System.out.println("This is a default method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpecifierAccess obj1=new SpecifierAccess();
		obj1.display1();
		obj1.display2();
		obj1.display3();
		obj1.display4();
	}
}




