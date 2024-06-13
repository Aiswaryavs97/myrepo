//Write a Java program that takes three numbers 
//as input to calculate and print the average of the numbers.


package MyPracticeSpace;
import java.util.Scanner;
public class Practice8 {

	public static void main(String[] args) {
		
		Scanner obj =new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=obj.nextInt();
		System.out.println("Enter Second Number");
		int b=obj.nextInt();
		System.out.println("Enter Third Number");
		int c=obj.nextInt();
		
		int average=(a+b+c)/3;
		System.out.println("Average of three number = "+average);
	}

}
