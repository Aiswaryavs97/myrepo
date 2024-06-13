//Write a Java program to swap two variables.


package MyPracticeSpace;

public class Practice11 {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		System.out.println("before swap"+" "+a);
		System.out.println("before swap"+" "+b);
		
		b=b-a;//b=1
		a=b+b;
		
		System.out.println("after swap"+" "+a);
		System.out.println("after swap"+" "+b);

	}

}
