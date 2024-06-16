package aggregation;

public class AggregationClass2 {

	String rank;
	int rollno;
	AggregatioClass1 refvar;// aggregation reference variable from class 1
	
	
	public AggregationClass2(String rank,int rollno,AggregatioClass1 refvar)
	{
		this.rank=rank;
		this.rollno=rollno;
		this.refvar=refvar;
		
	}
	
	public void display() 
	{
		System.out.println(rank+" "+rollno);
		System.out.println(refvar.name+" "+refvar.pincode+" "+refvar.city);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AggregatioClass1 obj1=new AggregatioClass1("Aiswarya",11,"Tvm");
		AggregationClass2 obj2=new AggregationClass2("first",11,obj1);
		
		obj2.display();

	}

}
