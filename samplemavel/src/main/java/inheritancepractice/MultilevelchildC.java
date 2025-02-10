package inheritancepractice;

public class MultilevelchildC extends MultilevelparentB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultilevelchildC obj =new MultilevelchildC();
		obj.display();
		obj.display1();
		obj.display2();
		
	}
        public void display2()
        {
        	System.out.println("chlid c");
        }
}
