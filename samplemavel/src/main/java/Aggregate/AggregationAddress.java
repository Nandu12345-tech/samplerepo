package Aggregate;

public class AggregationAddress {
	String city;
	String state;
	AggregationStudent ref;
	public AggregationAddress(String city,String state,AggregationStudent ref)
	{
		this.city=city;
		this.state =state;
		this.ref =ref;
	}
	public void display()
	{
		System.out.println(ref.name+" " +ref.roll);
		System.out.println(city+" "+ state);
		
	}
         public static void main(String args[])
         {
        	 AggregationStudent obj =new AggregationStudent("nandu",23);
        	 AggregationAddress obj1 = new AggregationAddress("Trivandrum","kerala", obj);
        	 obj1.display();
         }
}
