package com.futureskillit.Assignments;

public class DuplicateNumbersInArray {

	public static void main(String[] args) {
		
		int array[] ={55,-100,65,25,79,12,250,25,38,101,369,369, -100, -200};
		for(int i=0;i< array.length;i++	)
		{
			for(int j=i+1; j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					System.out.println("Duplicate Number is: "+ array[i]);
				}
			}
		}
	}
}
