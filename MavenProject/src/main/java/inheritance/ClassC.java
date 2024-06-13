package inheritance;

public class ClassC extends ClassB{

	
public void display3()
{
	System.out.println("C Child of B");}

public static void main(String[] args) {
		
	ClassC obj=new ClassC();
	
	obj.display1();
	obj.display2();
	obj.display3();
	
	}

}
