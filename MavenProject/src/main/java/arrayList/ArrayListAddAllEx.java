package arrayList;

import java.util.ArrayList;

public class ArrayListAddAllEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>listobj=new ArrayList<String>();
		listobj.add("Red");
		listobj.add("green");
		listobj.add("yellow");
		
		ArrayList<String>listobj2=new ArrayList<String>();
		
		listobj2.add("orange");
		listobj.addAll(listobj2);
		System.out.println(listobj);
	}

}
