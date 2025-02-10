package samplepackage;

public class stringbuilderExample {
	public static void main(String args[]) {
		StringBuilder sb =new StringBuilder("java");
		sb.insert(1, "welcome");
		System.out.println(sb);
		sb.delete(1,8);
		System.out.println(sb);
		sb.append(" welcome");
		System.out.println(sb);
		sb.replace(0, 4," selenium");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}

}
