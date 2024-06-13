package superkeyword;

public class SuperKeyWordConstructorChild extends SuperKeyWordConstructorParent {
	
	
	public SuperKeyWordConstructorChild() 
	
	{
		super(2,3);
		System.out.println("To refer the current constructor");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperKeyWordConstructorChild obj= new SuperKeyWordConstructorChild();
	}

}

// this and super important