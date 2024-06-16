package polymorphism;

public class MethodOverRidingChild extends MethodOverRidingParent {
	
	public void display() 
	{
		System.out.println("child class");
		super.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MethodOverRidingChild obj=new MethodOverRidingChild();
		obj.display();
	
	}

}
// it can be done as parent as parameterized 
//and child as non parameterizzes