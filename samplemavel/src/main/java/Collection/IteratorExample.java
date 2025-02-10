package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> s =new ArrayList<String>();
s.add("apple");
s.add("orange");
s.add("banana");
Iterator it =s.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
it.remove();
System.out.println(s);
}

	}


