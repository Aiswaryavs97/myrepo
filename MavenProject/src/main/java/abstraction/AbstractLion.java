 //Write a Java program to create an abstract class Animal 
//with an abstract method called sound(). Create subclasses Lion
//and Tiger that extend the Animal class and implement the sound()
//method to make a specific sound for each animal.

package abstraction;

public class AbstractLion extends AbstractAnimal {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractLion obj=new AbstractLion();
		obj.sound();

	}


	public void sound() {
		// TODO Auto-generated method stub
		
		System.out.println("Lion Voice");	
		
	}
	
	

}
