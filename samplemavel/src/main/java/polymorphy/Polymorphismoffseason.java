package polymorphy;

public class Polymorphismoffseason extends Polymorphismonseason{
	public void display(int p , float d)
	{
		float c = p*d;
		System.out.println("discount avaliable is "+c);
	    
	}

		
		
		
		
		
		
	public static void main(String[] args) {
		Polymorphismoffseason obj =new Polymorphismoffseason();
		Polymorphismonseason obj1 = new Polymorphismonseason();
		obj.display(1000, 0.15f);
		obj.display(1000, 0.40f);
	
		 
		// TODO Auto-generated method stub

	}

}
