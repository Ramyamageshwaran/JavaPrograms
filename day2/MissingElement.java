package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		//Declare the value
		int k=0;
		int[] arrayValue= {1,2,3,4,7,6,8};
		List<Integer> output=new ArrayList<Integer>();	
			for(Integer val:arrayValue)
			{
				output.add(val);
			}
			//Arrange the value in Ascending order
			Collections.sort(output);
			System.out.println(output);
			//Find the difference between array elements
			int diff=output.get(k+1)-output.get(k);
				 for(int i=0;i<output.size();i++)
				 {
				 
					if(output.get(i+1)-output.get(i)!=diff)
					{
						
						System.out.println(output.get(i)+diff);
					}
				 }
							
		}
	}


