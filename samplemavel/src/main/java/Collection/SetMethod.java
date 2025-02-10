package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new HashSet<String>();
		s.add("black");
		s.add("blue");
		s.add("white");
		Set<String> s1=new HashSet<String>();
		s1.add("white");
		s1.add("green");
		s.addAll(s1);
		System.out.println(s);
		System.out.println(s.contains("blue"));
		System.out.println(s1.containsAll(s));
		System.out.println(s.isEmpty());
		s.remove("blue");
		System.out.println(s);
		s.removeAll(s1);
		System.out.println(s);
		s.removeAll(s1);
		System.out.println(s);
		System.out.println(s.size());
	}

}
