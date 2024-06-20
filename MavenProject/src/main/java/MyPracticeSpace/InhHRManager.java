//Write a Java program to create a class called Employee 
//with methods called work() and getSalary(). 
//Create a subclass called HRManager that overrides the work()
//method and
//adds a new method called addEmployee().





package MyPracticeSpace;

public class InhHRManager extends InhEmployee{
	
	public void work() 
	{
		super.work();
		super.getSalary();
		System.out.println("second class work");
		
		
	}

	public void addEmployee() 
	{
		System.out.println("Add new employee");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InhHRManager obj=new InhHRManager();
		
		obj.work();
		obj.addEmployee();
	

	}

}
