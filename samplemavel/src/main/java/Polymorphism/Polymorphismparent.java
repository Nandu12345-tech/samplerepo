package Polymorphism;

public class Polymorphismparent extends Polymorphism1
{
	public void display(int a,int b)
	{
		int c=a+b;
		System.out.println("sum of the integer is"+c);
		super.display(3, 6);
		
	}
	
	
	public static void main(String args[])
{
		Polymorphismparent obj=new Polymorphismparent();
		obj.display(4, 2);
}
    
}
