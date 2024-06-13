package inheritance;

public class SingleExample extends ParentClass {
	
	public void display2() {
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
		
		SingleExample obj=new SingleExample();
		obj.display1();
		obj.display2();

	}

}
