package com.cybage;

import java.util.Scanner;

class Service 			//service class is created
{
	
	private int itemPrice;
	
	private boolean hairCutService;
	private boolean hairWashService;
	private boolean pedicureService;
	private boolean eyebrowService;
	
	public static Scanner sc = new Scanner(System.in);
	 
	
	
	
	
	public int getItemPrice()				//getter method 
	{
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) 	//setter method 
	{
		this.itemPrice = itemPrice;
	}
	public boolean isHairCutService()		//getter method 
	{
		return hairCutService;
	}
	public void setHairCutService(boolean hairCutService)	//setter method 
	{
		this.hairCutService = hairCutService;
	}
	public boolean isHairWashService() 				
	{
		return hairWashService;
	}
	public void setHairWashService(boolean hairWashService) {
		this.hairWashService = hairWashService;
	}
	public boolean isPedicureService() {
		return pedicureService;
	}
	public void setPedicureService(boolean pedicureService) {
		this.pedicureService = pedicureService;
	}
	public boolean isEyebrowService() {
		return eyebrowService;
	}
	public void setEyebrowService(boolean eyebrowService) {
		this.eyebrowService = eyebrowService;
	}
	
	
	
	
	@Override
	public String toString() {
		return String
				.format("Service [hairCutService=%s, hairWashService=%s, pedicureService=%s, eyebrowService=%s]",
						hairCutService, hairWashService, pedicureService,
						eyebrowService);
	}
	public void productToBuy()		//function to menu driven program to enter 
	{
		
		int productChoice;
		System.out.println("What you want to buy");
		do
		{
			
			System.out.println("We have");
			System.out.println("1.Shampoo");
			System.out.println("2.Cream");
			System.out.println("3.Moisturizer");
			System.out.println("Enter your choice");
			productChoice= sc.nextInt();
			
			switch(productChoice)
			{
			case 1:
				System.out.println("You buyed Shampoo");
				this.itemPrice=150;
				break;
			case 2:
				System.out.println("You buyed Cream");
				this.itemPrice=340;
				break;
			case 3:
				System.out.println("You buyed Moisturizer");
				this.itemPrice=650;
				break;
			}
			
			
		}
		while(productChoice!=0);
		
	}
	
	
	
	public void serviceWant()			//function to  know the service you want to avail
	{
		int serviceChoice;
		do
		{
			System.out.println("Which Service you want today");
			//System.out.println("We have");
			System.out.println("1.HairCut");
			System.out.println("2.Hairwash");
			System.out.println("3.Pedicure");
			System.out.println("3.eyebrow ");
			System.out.println("Enter your choice");
			
			
			serviceChoice= sc.nextInt();
			

			switch(serviceChoice)
			{
			case 1:
				this.setHairCutService(true);
				break;
			case 2:
				//System.out.println("You buyed Cream");
				this.setHairWashService(true);
				break;
			case 3:
				//System.out.println("You buyed Moisturizer");
				this.setPedicureService(true);
				break;
			case 4:
				//System.out.println("You buyed Moisturizer");
				this.setEyebrowService(true);
				break;
			}
			
			
			
		}while(serviceChoice!=0);
		
	}
	
}
