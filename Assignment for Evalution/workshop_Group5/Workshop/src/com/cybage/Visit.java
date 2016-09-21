package com.cybage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Visit {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		List<Customer> list = new ArrayList<Customer>();			//list of customer maintened
		
		
		int choice;
		
		do
		{
			System.out.println("what you want to do");
			System.out.println("1.add customer");
			System.out.println("2.display customer");
			System.out.println("3.service");
			
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
			case 1:
				addCustomer(list);			//addcustomer function is called
				break;
			case 2:
				displayCustomer(list);		//addcustomer function is called
				break;
			case 3:
				service(list);
			}
			
			
		}while(choice!=0);
		
	
	}
	public static void addCustomer(List<Customer> list )
	{
		Membership m = null;
		
		Service cusServ = new Service();				//service class object is created
		System.out.println("Enter new Customer name:");		
		String name=sc.nextLine();						//input is taken for customer id
		System.out.println("Enter new Customer ID:");
		int id=sc.nextInt();
		System.out.println("Which membership you want");
		System.out.println("1.Premium");
		System.out.println("2.Gold");
		System.out.println("3.Silver");
		System.out.println("4.Not required");
		int memId = sc.nextInt();			//runtiimeid decide which memebership we will take
		if(memId==1)
			m=new Premium();
		else if(memId==2)
			m =  new Gold();
		else if(memId==3)
			m =  new Silver();
		
		Customer c1=new Customer(name, id,m, cusServ);		//customer object is created
		
		list.add(c1);
		System.out.println("Customer added");
		
		
	}
	
	
	
	public static void displayCustomer(List<Customer> list )		//function used to display list
	{
		
		  for (Customer c : list) 
		   {
			System.out.println(c);
	    	}
		
	}

	
	
	public static void service(List<Customer> list )			//function used to check for customer exists or not
	{
		int choice;
		System.out.println("Press 1 if you are already register");
		System.out.println("else Press 2");
		choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("enter id");
			int id=sc.nextInt();
			
			Iterator it = list.iterator();
			while(it.hasNext())
			{
				Customer c = (Customer)it.next();
				if(c.getCustomerId()==id)
				{
					System.out.println("customer found");
					serveCustomer(c);
				}
			}
		}
	}
	
	
	public static void serveCustomer(Customer c1)			//function used to provide services
	{
		c1.getCustService().productToBuy();
		c1.getCustService().serviceWant();
		Discount d = new Discount(c1);
		d.billCalculation();
	}
}
