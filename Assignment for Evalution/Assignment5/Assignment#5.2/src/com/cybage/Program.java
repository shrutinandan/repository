package com.cybage;
abstract class BankAcoount   			//class bankaccout is created
{
	private int accountNumber;
	abstract  int rateOfInterest();
	}
	

class Saving extends BankAcoount			//class bankaccout is inherited into saving
{

	@Override
	int rateOfInterest() 					//rateOfInterest method is inherited from class BankAccount
	{
		
		System.out.println("rate of interest is 20 %");
		return 0;
	}
	
}
class Current extends BankAcoount			//class bankaccout is inherited into current
{

	@Override
	int rateOfInterest() 					//rateOfInterest method is inherited from class BankAccount
	{
		System.out.println("rate of interest is 30 %");
		return 0;
	}
	
}
public class Program {
	public static void main(String[] args) {
		Saving sav=new Saving();     //object of saving class is created
		sav.rateOfInterest();			//method is called from an object
		Current cur=new Current();    //object of current class is created
		cur.rateOfInterest();
	}
	

}
