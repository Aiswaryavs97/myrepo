package MultipleInheritance;

public class MultipleInheritanceChildA implements InterfaceA,InterfaceB {
	
	

	public static void main(String[] args) {
		
		MultipleInheritanceChildA obj=new MultipleInheritanceChildA();
		obj.display();
		obj.display1();
		obj.display2();
		
		// TODO Auto-generated method stub

	}

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		
		System.out.println("Parent B");
		
	}

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		
		System.out.println("parent A");
	}
	
	public void display() {
		
		System.out.println("multiple inheritance lesson");
	}

}
