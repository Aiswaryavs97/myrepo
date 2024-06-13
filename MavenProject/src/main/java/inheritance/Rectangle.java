//Write a Java program to create a class called
//Shape with a method called getArea(). 
//Create a subclass called Rectangle that overrides the 
//getArea() method
//to calculate the area of atriangle


package inheritance;

public class Rectangle extends Shape {

	public void calculateTheAreaOfTriangle(int a, int b, int c) {
		
		
		int areaoftriangle= a*b*c;
		
		
		System.out.println("area of triangle = "+" "+areaoftriangle);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle obj=new Rectangle();
		
		obj.getArea();
		obj.calculateTheAreaOfTriangle(2, 2, 2);
		
	}

}
