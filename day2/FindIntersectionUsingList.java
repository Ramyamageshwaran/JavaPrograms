package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersectionUsingList {

	public static void main(String[] args) {
		//Declare the inputs
		int[] input= {3,2,11,4,6,7};
		int[] input1= {1,2,8,4,9,7};
		//Add the value in ArrayList
		List<Integer> ListInput=new ArrayList<Integer>();
		List<Integer> ListInput1=new ArrayList<Integer>();
		for(int i=0;i<input.length;i++)
		{
			ListInput.add(input[i]);
			ListInput1.add(input1[i]);
			
		}
		//Arrange the value in Ascending order
		 Collections.sort(ListInput);
		 Collections.sort(ListInput1);
		 System.out.println(ListInput);
		 System.out.println(ListInput1);
		 Object[] array = ListInput.toArray();
		 Object[] array1 = ListInput1.toArray();
	        for(int i=0;i<ListInput.size();i++)
	        {
	        	for(int j=0;j<ListInput1.size();j++)
	        	{
	        		//check both numbers are same  
	        		if(array[i].equals(array1[j]))
	        		{
	        			System.out.println(array[i]);
	        		}
	        	}
	        }	}

}
