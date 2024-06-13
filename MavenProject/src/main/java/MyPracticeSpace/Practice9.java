//Write a Java program to print the area and
//perimeter of a rectangle.
//Test Data:
//Width = 5.5 Height = 8.5
//Expected Output
//Area is 5.6 * 8.5 = 47.60
//Perimeter is 2 * (5.6 + 8.5) = 28.20

package MyPracticeSpace;

public class Practice9 {

	public static void main(String[] args) {
		
		double Width=5.6,height=8.5;
		
		double area=Width * height;
		double Perimeter = 2*(Width+height);
		System.out.println(area);
		System.out.println(Perimeter);

	}

}
