package polymorphism;

public class MethodParaChild extends  MethodParaParent{

	public void display(int a, int b)
	{
		int c= a+b;
		
		System.out.println("total="+" "+c);
		super.display();
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MethodParaChild obj=new MethodParaChild();
		obj.display(10, 20);
	}

}
