package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		//Declare the value
		String input="madam";
		String temp="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			temp=temp+input.charAt(i);
			
		}if (input.equals(temp))
		{
	
			System.out.println(input+" String is a Palindrome ");
		}else 
			System.out.println(input +" String is not a Palindrome ");

	}

}
