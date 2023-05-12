package week3.day2;

//import java.util.Iterator;

public class ReverseEvenWords {

	public static void main(String[] args) {
		//Declare the value
		String temp="";
		
		String input="I am a software tester";
		String[] split = input.split(" ");
		System.out.println("Reverse the Words only even index values in Array");
		for(int i=0;i<split.length;i++)
		{
	     if(i%2!=0)
				{	
	    	    	temp=split[i];
					String output="";
					for(int j=temp.length()-1;j>=0;j--)
					{
						output+=temp.charAt(j);
					}
					split[i]=output;
		   		}
			
		}
		String output1=String.join(" ", split);
		System.out.println(output1);
	}
	
}

