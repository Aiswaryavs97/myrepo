package inheritance;

public class HierarchyChildC extends HierarchyParentA {
	
	public void display1()
	{
		System.out.println("C child of A");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchyChildC obj=new HierarchyChildC();
		obj.display1();
		obj.display();
		
	}

}

