package inheritance;

public class singlechild extends Singleparent {
	

	public static void main(String[] args) {
		singlechild obj=new singlechild();
		obj.display();
		obj.display1();
		
		// TODO Auto-generated method stub

	}
	public void display1()
	{
		System.out.println("child class");
	}

}
