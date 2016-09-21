package com.cybage;

public class Program {
	
	public static void main(String[] args) {	
		
		Person p= new Patient();   	//base class storing the reference of derived class
	Patient p1=new Patient();  		//object of derived class Patient
	Money m=new Money();				//object of Money class
	p.setName("Abhi");			//setter method from Person (base class) is called
	System.out.println("Patient details are:");
	
	System.out.println("Name :"+p.getName());	//to print details of person class

	System.out.println(p);					//to print details of patient class(object)
	
	p1.calcMedicalFees(new Money());		//to calculate medical fees

}
}