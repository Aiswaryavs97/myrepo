package arrayList;

import java.util.ArrayList;

public class ArrayListIsEmptyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>listobj=new ArrayList<String>();
		listobj.add("Red");
		listobj.add("green");
		listobj.add("yellow");
		
		boolean a=listobj.isEmpty();
		System.out.println(a);
		}

}
