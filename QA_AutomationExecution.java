package com.futureskillit.Assignments;

import java.util.Scanner;

public class QA_AutomationExecution {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int browserChoice;
		//int testsuitchoice;
		
		String environment="";
		String browser="";
		String testSuite="";
		
		int testCount=0;
		
		System.out.println("Select Environment");
		System.out.println("1. DEV");
		System.out.println("2. QA");
		System.out.println("3. STAGE");
		
		//System.out.println("Enter Environment choice: ");
		 int envChoice=sc.nextInt();
		 
		 while(envChoice<1 || envChoice>3)
		 {
		     System.out.println("Invalid Environment! Try again");
		     System.out.println("Enter Environment choice: ");
		     envChoice=sc.nextInt();
		 }
		 
		 if (envChoice==1)
		 {
			 environment="DEV";
		 }
		 else if(envChoice==2) 
		 {
			 environment="QA";
		 }
		 else
		 {
			 environment="STAGE";
		 }
		 
		 do 
		 {

	       System.out.println("Select Browser:");
	       System.out.println("1. Chrome");
	       System.out.println("2. Firefox");
	       System.out.println("3. Edge");

	       System.out.println("Enter Browser Choice: ");
	       browserChoice = sc.nextInt();

	       switch (browserChoice) 
	       {

	           case 1:
	                browser = "Chrome";
	                break;

	           case 2:
	                browser = "Firefox";
	                break;

	           case 3:
	                browser = "Edge";
	                break;

	                default:
	                    System.out.println("Invalid Browser! Try again.");
	            }

	        } while (browserChoice < 1 || browserChoice > 3);
		 
		 int testsuitechoice;
		 //Test Suite Selection
		 do
		 {
			 System.out.println("Select Test Suite: ");
			 System.out.println("1. Smoke: ");
			 System.out.println("2. Regression: ");
			 System.out.println("3. Sanity: ");
			 
			 System.out.println("Enter Test suice choice: ");
			 testsuitechoice=sc.nextInt();
			 	
			 switch(testsuitechoice) 
			 {
			 case 1:
				  testSuite="Smoke";
				  testCount=20;
				  break;
				  
			 case 2: 
				  testSuite="Regression";
				  testCount=100;
				  break;
				
			 case 3: 
				  testSuite="Sanity";
				  testCount=30;
				  break;
				  
		    default: 
		    	System.out.println("Invalid Test Suite! Try again");
			 
			 }
		 }while(testsuitechoice<1 ||testsuitechoice>3);
		 
		 
		 //Final Execution
		 
		 System.out.println("Execution Summary");
		 
		 System.out.println("Environment: "+ environment);
		 System.out.println("Broser: "+ browser);
		 System.out.println("Test Suite: "+ testSuite);
		 System.out.println("Test Count: "+ testCount);
		 
		 System.out.println("Starting automation execution...");

		 		 
		 sc.close();
		 			
	}

}
