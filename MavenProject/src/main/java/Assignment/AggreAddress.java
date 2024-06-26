package Assignment;
//write a program to get the details of a student 
//class 1 student 
//get the student name and roll number 
//class 2 address
//get the address of student 
//print student name , roll number with address
//there is no is a relationship
public class AggreAddress 
   {
	
	String address;
	AggreStudent ref;
	public AggreAddress(String address, AggreStudent ref) 
	
	{
		this.address=address;
		this.ref=ref;
	}
	public void display()
	
	{
		System.out.println("Address="+" "+address);
		System.out.println("Name and RollNumber ="+" "+ref.name+" "+ref.rollNumber);
	}
	public static void main(String[] args) 
	
	{
		AggreStudent obj1=new AggreStudent("Aiswarya",695028);
		
		AggreAddress obj2= new AggreAddress("Aiswaryamritham Mottamood Vettinad Vattappara Po",obj1);
		obj2.display();
	}
   }
