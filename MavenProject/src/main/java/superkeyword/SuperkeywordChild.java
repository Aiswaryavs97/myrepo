package superkeyword;

public class SuperkeywordChild extends SuperKeywordParent{
	// to refer the parent class instance variable
	String name="Amritha";
	
	public void display() {
		System.out.println(name);
		System.out.println(super.name);

	}
	
	
	public static void main(String args[]) {
	SuperkeywordChild obj = new SuperkeywordChild();
	obj.display();
}}
