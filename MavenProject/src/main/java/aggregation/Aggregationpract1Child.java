package aggregation;

public class Aggregationpract1Child {

	int a,b;
	aggregationprac1 ref;
	int c;
	public Aggregationpract1Child(int a, int b,aggregationprac1 ref)
	{
		this.a=a;
		this.b=b;
		this.ref=ref;
	}
	
	public void display() 
	{
		int c=a+b;
		System.out.println("total"+" "+c);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		aggregationprac1 obj2=new aggregationprac1(5,5);
		Aggregationpract1Child obj=new Aggregationpract1Child(10,20,obj2);
		obj.display();
		obj2.display2();
	}

}

