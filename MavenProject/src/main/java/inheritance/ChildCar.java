package inheritance;

public class ChildCar extends InheritanceVehicle {

	public void drive1() {System.out.println("Repairing Car");}
	
	public static void main(String[] args) {
		
		ChildCar obj=new ChildCar();
		obj.drive();
		obj.drive1();
		
	}

}
