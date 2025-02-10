package InterfaceEx;

public class Interface2  implements Interface1{
	public void show()
	{
		System.out.println("hello");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display method");
		
	}
	public static void main(String args[])
	{
		Interface2 obj =new Interface2();
		Interface1 obj1 = new Interface2();	
		obj.display();
		obj.show();
		obj1.display(); 
	}
      
}