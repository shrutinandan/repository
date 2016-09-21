package com.cybage;									
class FuelCheck extends Exception		//user-defined exception
{  
	FuelCheck(String s){  
	  super(s);  
	 }  
} 

public class Machine {
				
	boolean fuel;      	//variable
	
	
	public static void start(int fuel) throws FuelCheck			//function which throw user-defined function
	{
	     if(fuel<0)  
	         throw new FuelCheck("fuel is not suffient to start the machine");  
	        else  
	         System.out.println("Machine started");  
		
	}
	
	
	public static void stop(int fuel)throws FuelCheck		//function which throw user-defined function
	{
		if(fuel>100)  
	         throw new FuelCheck(" Machine stopped");  
	        else  
	         System.out.println("Machine will be in in running state");  
		
	}
	
	
	public static void execute(int fuel)throws FuelCheck		//function which throw user-defined function
	{
		if(fuel<0 && fuel>100)
		      throw new FuelCheck(" Machine will not be in running state");  
      else  
       System.out.println("Machine will  execute"); 
			
	}

	public static void main(String[] args) {
	
		 try				//try -catch to handle the user-defined exception
		 {  
		      start(45);  //start method is called
		      execute(16); //execute method is called
		      stop(150);  //stop method is called
		     
		      }
		 catch(Exception m)
		 {
		    	  System.out.println("Exception occured: "+m);
		    	  }  
	
		 finally  			 //finally block
		 {
			 System.out.println(" finally");
		 }
		  }  
	
		

	}

