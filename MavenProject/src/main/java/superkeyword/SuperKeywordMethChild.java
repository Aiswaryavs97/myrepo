package superkeyword;

public class SuperKeywordMethChild extends SuperKeywordMeth {
	
	public void display2() {
		System.out.println("To refer the parent class");
		super.display(2, 3);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperKeywordMethChild obj=new SuperKeywordMethChild();
		

		obj.display2();
		
		
	}

}
