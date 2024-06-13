//Write a Java program to print the area and perimeter of a circle.
//Test Data:
//Radius = 7.5
//Expected Output
//Perimeter is = 47.12388980384689
//Area is = 176.71458676442586




package MyPracticeSpace;

public class Practice7 {

	public static void main(String[] args) {
		
		double r=7.5;
		double pie =3.14;
		double area = pie*r*r;
		System.out.println("area of circle = "+area);
		
		double perimeter=2*pie*r;
		System.out.println("permieter = "+perimeter);

	}

}
