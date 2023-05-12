package week3.day2;


import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateInArray {

	public static void main(String[] args) {
		//Declare the value in array
		int[] input= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		//Declare the array value in Set to aviod duplicate
		Set<Integer> value=new TreeSet<Integer>();
		System.out.println("Print Duplicate Number in Array");
		for(Integer out:input)
		{
		//check the duplicate values
		if(value.add(out)==false)
		{
				
				System.out.println(out);
		}
		}

	}
}
