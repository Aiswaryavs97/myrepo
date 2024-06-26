package List;

import java.util.ArrayList;
import java.util.List;

public class ListGetEx {
	
	// it is not example of Get it is the example of Contains 
	//to check the value is available 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>obj= new ArrayList<>();
		
	obj.add("red");
	obj.add("blue");
	obj.add("green");
	
	boolean a=obj.contains("blue");
	System.out.println(a);
	
	}

}
