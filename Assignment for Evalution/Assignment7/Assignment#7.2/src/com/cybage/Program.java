package com.cybage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Program {
	static Scanner sc=new Scanner(System.in); //scanner is used to input
	public static void main(String[] args) {
		int choice=0;
		
		ArrayList<Patient> p=new ArrayList<>();
	Person p0= new Patient();   	//base class storing the reference of derived class
	p.add(new Patient(1,"apool","12/02/2016","p-191",10000));   //new object is added into list
	p.add(new Patient(2,"jolly grand","16/02/2016","dehradun",15000));		//new object is added into list
	p.add(new Patient(3,"shah","16/04/2000","pune",17000));   		 //new object is added into list
	p.add(new Patient(4,"kothari","09/10/2012","pune",1000));    //new object is added into list
	p.add(new Patient(5,"ici","15/02/2012","delhi",19000));		//new object is added into list

		Iterator<Patient> itr = p.iterator();
		
	do
	{	
	System.out.println("1.Create new record \n 2.Update patients address \n 3.Remove patient  \n 4.Size of list \n");
	System.out.println("Enter your choice");
	choice=sc.nextInt();  

	
	
		
		switch(choice)
		{
				case 1:				//when new recor id added into the list
					System.out.println("enter new record:");	
					p.add(new Patient(6,"kirti","19/02/2016","mumbai",10400));
					for (Patient patient : p) {
						System.out.println("new list is:" +patient);
					}
					
					break;
				case 2:   //update a record into the list
					
					Patient pi =null;
					
						while(itr.hasNext())
						{
							pi=(Patient)itr.next();
								if(  pi.getPatientNumber()==1)			//check the condition
									{
										pi.setPatientAddress("goa");		//update it
										break;
									}
						
						}
							System.out.println(pi);
							System.out.println("UPDATE");				
					break;
				case 3:			//delete a record into the list
			        Scanner in=new Scanner(System.in);
			        System.out.println("enter position you want to delete");
			        int num=in.nextInt();
			        p.remove(num);			//delete the record
			        for (Patient patient : p) {
						System.out.println("new list is:" +patient);
					}
			
					break;
				case 4:			//get the size of the list					
					 System.out.println("total no.patients  in list are "+ p.size());
					break;
		}
	}		while(choice!=0);
	
}

}