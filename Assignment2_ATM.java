package com.futureskillit.Assignments;

import java.util.Scanner;

public class Assignment2_ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int validPIN=1234;
		int balance=200000;
		int wAmt;
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter PIN: ");
		int PIN=sc.nextInt();
	   
		if(PIN==validPIN)
		
		{
		
		   System.out.println("Login Successful");
		   while(true) 
		   {
		   System.out.println("Enter Withdrawal Amount: ");
			wAmt=sc.nextInt();
			if (wAmt<=0) 
			{
			 System.out.println("Amount must be positive");
			 wAmt=sc.nextInt();
			}
			else if(wAmt>balance)
		    {
		    	System.out.println("Insufficient Balance");
		    	//wAmt=sc.nextInt();
		    	System.out.println("Available balance is: "+balance);
		    }
			 else if (wAmt % 100 != 0) 
			 {
                 System.out.println("Amount must be in multiples of 100");
             }
			 else {
				 balance=balance-wAmt;
				 System.out.println("Withdraw Successful");
				 System.out.println("Withdrawn Amount is: "+wAmt);
				 //wAmt=sc.nextInt();
				 System.out.println("Remaining balance is : "+balance);
				 break;
				 
			 }
				 
		   }	
		}
		else
		{
		   System.out.println("Invalid PIN. Access denied	");
	    }
		   
		sc.close();

	}

}
