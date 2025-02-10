package Exceptionhandling;

public class Customexception {

	public static void main(String[] args) throws VotingException {
		int age =8;
		if (age>=18)
		{
			System.out.println("eligible for voting");
		}
		else {
			throw new VotingException("Age under 18");
		}
		// TODO Auto-generated method stub

	}

}
