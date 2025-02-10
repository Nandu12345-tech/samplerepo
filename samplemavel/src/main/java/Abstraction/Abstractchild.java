package Abstraction;

public class Abstractchild extends Abstraction1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Abstractchild obj =new Abstractchild();
		Abstraction1 obj =new Abstractchild(); 
		obj.display();
		obj.display1();
		obj.
	

	}
	public void display2() {
		System.out.println(" world ");
	
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(" hello world");
		
	}

}
