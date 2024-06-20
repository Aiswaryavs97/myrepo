package abstraction;

public class AbstractTiger extends AbstractLion{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		AbstractTiger obj=new AbstractTiger();
		obj.sound();	
	}

	public void sound()
	{
		super.sound();
		System.out.println("sound of Tiger is GRRR");
	}
}


