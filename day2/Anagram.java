package week3.day2;


public class Anagram {

	public static void main(String[] args) {
		//Declare the value
		String input1="stops";
		String input2="potss";
		//Check length of string
		if(input1.length()==input2.length())
		{
			System.out.println("Both Strings are equal in length");
		}
		//Check both array values are same
		if(input1.equals(input2))
		{
			System.out.println("Both Strings are same value ");
		}
		else
		{
			System.out.println("Both Strings have different value ");
		}
	}
}
