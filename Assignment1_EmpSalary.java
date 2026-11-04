package com.futureskillit.Assignments;

import java.util.Scanner;

public class Assignment1_EmpSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1) Employee Bonus and revised salary Calculator
		Scanner sc=new Scanner(System.in);
		
    System.out.println("Enter Employee Salary: ");
    int empsal=sc.nextInt();
    while(empsal<=0)
    {
    	System.out.println("Invalid Salary! Enter Salary greater than 0: ");
    	empsal=sc.nextInt();
    }
    
    System.out.println("Rate Employees Performace (1-5): ");
    int rating=sc.nextInt();
    while(rating< 1 || rating >5)
    {
    	System.out.println("Invalid Rarting! Enter rating between 1 to 5: ");
    	rating=sc.nextInt();
    }
    System.out.println("Enter Year of Service: ");
    int YOS=sc.nextInt();
    while(YOS<=0)
    {
    	System.out.println("Invalid Years! Enter Year greater than 0: ");
    	YOS=sc.nextInt();
    }
    
    // Calculating  performance bonus using switch
    int RatingBonus=0;
    switch(rating)
    {
    case 5:
    	RatingBonus=20;
    	break;
    	
    case 4:
    	RatingBonus=15;
    	break;
    	
    case 3:
    	RatingBonus=10;
    	break;
    	
    case 2:
    case 1:
    	RatingBonus=0;
    	break;
    }
    
    //Calculation of Service Bonus
    int serviceBonus=0;
    
    if(YOS>5 && RatingBonus>0)
    {
    	serviceBonus=5;	
    }
    
    //Calculation of Total Bonus and Salary
    int totalBonus=RatingBonus+serviceBonus;
    
    double bonusAmt=empsal*totalBonus/100;
    
    double finalSalary=empsal+bonusAmt;
    
    //Display Output
    System.out.println("Rating Bonus: "+ RatingBonus + "%");
    System.out.println("Service Bonus: "+ serviceBonus + "%");
    System.out.println("Total Bonus: "+ totalBonus + "%");
    System.out.println("Bonus Amount: " +bonusAmt);
    System.out.println("Final Salary: " +finalSalary);
    
    sc.close();
    
    
    
    
	}

}
