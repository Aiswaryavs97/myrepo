package interfacepackage;



// use implements keyword to connect a interface to class
// use extends key word to connect a class to class 
//and interface to interface
public class ExInterfaceChild implements ExInterfaceParent  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExInterfaceChild obj=new ExInterfaceChild();
		obj.display();
		}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("aiswarya interface");
	}

}
