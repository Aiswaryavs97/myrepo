
//Write a Java program to create a class called Animal with a method named move(). 
//Create a subclass called Cheetah that overrides the move() method to run.


package MyPracticeSpace;

public class InhCheetah extends InhAnimal {

	public void move() {
		
		super.move();
		System.out.println("run ");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InhCheetah obj=new InhCheetah();
		obj.move();	
	}
}
