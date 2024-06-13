package inheritance;

public class HierarchyChildB extends HierarchyParentA {
	
	public void display1() {
		
		System.out.println("Child B of A");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HierarchyChildB obj=new HierarchyChildB();
		obj.display1();
		obj.display();
		

	}

}
