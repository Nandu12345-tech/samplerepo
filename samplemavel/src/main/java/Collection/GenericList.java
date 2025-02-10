package Collection;

import java.util.ArrayList;
import java.util.List;

public class GenericList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> s =new ArrayList<String>();
       s.add("RED");
       s.add("black");
       s.add("green");
       s.add("White");
       s.add("violet");
       s.add("yellow");
       System.out.println(s);
       System.out.println(s.get(3));
       s.set(2, "gold");
       System.out.println(s.indexOf("RED"));
       
       System.out.println(s.lastIndexOf("RED"));
       s.remove(3);
       System.out.println(s);
       System.out.println(s.contains("black"));
       System.out.println(s.contains("yellow"));
	}

}
