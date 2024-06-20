//Write a Java program to create a class called Shape
//with a method called getArea(). Create a subclass
//called Rectangle that overrides the getArea() method
//to calculate the area of a rectangle



package MyPracticeSpace;

public class InhRectangle extends InhShape {
	
	int a,b,c;

	public void getArea(int a, int b)
	{
		this.a=a;
		this.b=b;
	
		
		c=a*b;	
		System.out.println("area of triangle="+" "+c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		InhRectangle obj=new InhRectangle();
		obj.getArea();
		obj.getArea(10, 3);
	

	}

}
