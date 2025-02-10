package samplepackage;

public class samplestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "hello";
       String s1 = "HELLO";
       String s2= "India is my country";
       char c = s.charAt(3);
       System.out.println(c);
       System.out.println(s.length());
       System.out.println(s.concat(s1));
       System.out.println(s.equals(s1));
       System.out.println(s.equalsIgnoreCase(s1));
       System.out.println(s2.contains(" is"));
	}

}
