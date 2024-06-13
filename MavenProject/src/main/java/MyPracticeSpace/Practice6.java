// Write a Java program to compute a specified formula.
//Specified Formula :
//4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
//Expected Output
//2.9760461760461765



package MyPracticeSpace;

public class Practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a=4.0, b=1.0;
		int c=1,d=3,e=5,f=7,g=9,h=11;
		
		double result = a*(c-(b/d)+(b/e)-(b/f)+(b/g)-(b/h));
		
		System.out.println("resut = "+result);
		
	}

}
 