package firstmavenproject;

public class MethodAssig {


	int fact=1;
	public void  method1(int count) 
	{
		
		
		for(int i=1;i<=count;i++) 
		{
			fact=i*fact;//4*3*1
		}
	}
	public void method2() 
	
	{  
		this.method1(4);
		System.out.println("factorial"+" "+fact);
	}
	public static void main(String args) 
	{
		MethodAssig obj=new MethodAssig();
		obj.method2();
	}

}


	
