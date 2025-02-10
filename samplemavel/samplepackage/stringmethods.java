package samplepackage;

public class stringmethods {
	public static void main(String args[])
	{
	String s ="Hello";
	String s1 ="world";
	String s2 ="HELLO";
	String s3 ="India is my country";
	char c = s.charAt(3);
	System.out.println(c);
	System.out.println(s.length());
	System.out.println(s.concat(s1));
	System.out.println(s.equals(s2));
	System.out.println(s.equalsIgnoreCase(s2));
	System.out.println(s3.contains("is"));
}

}
