package MyPracticeSpace;

public class Cat extends Animal {
	
	
	public void bark() 
	{
		System.out.println("bark");
	}

	public static void main(String[] args) {
	
		Cat obj= new Cat();
		obj.bark();
		obj.makeSound();
	}

}
