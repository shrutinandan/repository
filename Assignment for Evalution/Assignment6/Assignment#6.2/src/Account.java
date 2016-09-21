package com.cybage;
import java.util.Scanner;
	class InSufficientBalanceException extends Exception 		//user-defined exception
	
	{  
		InSufficientBalanceException(String s){  
		  super(s);  
		 }  
	} 

public class Account {
		
	double amount;  		//variable
	public static double balance=20000;
		
		
	public static void withdrawn(double amount,double balance) throws InSufficientBalanceException		//function which throw user-defined function
		{
		     if(amount> balance)  
		         throw new InSufficientBalanceException("Dont have suffient balance to withdraw the amount from bank");  
		        else  
		         System.out.println("Money withrawn is :Rs"+amount);  
			
		}
	
				public static void main(String[] args) {
			
			 try 		//try -catch to handle the user-defined exception
			 {  
			     Scanner sc=new Scanner(System.in);		//input at runtime
			     System.out.println("Enter the money to be withdrawn:");	
			     double i=sc.nextDouble();
			     withdrawn(i,balance);		//withdrawn method is called
			     
			      }
			 catch(Exception m)
			 {
			    	  System.out.println("Exception occured: "+m);
			    	  }  
		
			 finally 				 //finally block
			 {
				 System.out.println("inside finally");
			 }
		}  
		
			

}





