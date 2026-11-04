package com.futureskillit.Assignments;

public class Smallest_SecondSmallest_NumInArray {
	public static void main (String args[]) {
		
		int array[]= {55,65,79,12,250,25,38,101,369,369,100,200};
		int smallest=array[0];
		int secondSmallest=array[0];
		for(int i=0; i< array.length; i++) 
		{
			if(array[i]<smallest) 
			{
				secondSmallest=smallest;
				smallest=array[i];
			}
			else if (array[i]<secondSmallest && array[i] != smallest)
			{
				secondSmallest=array[i];
			}
		}
		System.out.println("Smallest number in an Array is: "+smallest);
		System.out.println("Second Smallest Number is : "+secondSmallest);
	}

}
