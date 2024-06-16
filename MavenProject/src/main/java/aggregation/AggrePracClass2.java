package aggregation;

public class AggrePracClass2 {
	
	int phoneno;
	int age;
	AggrePrac1 ref;
	
	AggrePracClass2(int phoneno, int age,AggrePrac1 ref)
	{
		this.age=age;
		this.phoneno=phoneno;
		this.ref=ref;
	}
	
	public void display() 
	{
		System.out.println(phoneno+" "+age+" "+ref);
		System.out.println(ref.name+" "+ref.place);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AggrePrac1 obj1=new AggrePrac1("Aiswarya","TVM");
				
	 AggrePracClass2 obj2= new AggrePracClass2(12345679,26,obj1);
	 
	 obj2.display();
				
		

	}

}
