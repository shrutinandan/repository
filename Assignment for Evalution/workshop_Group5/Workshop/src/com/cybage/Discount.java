package com.cybage;

public class Discount 			//discount class is created
{
	private int servicePrice;
	private int totalPrice;
	private Customer cus;
	
	
	public Discount(Customer cus) 
	{
		this.cus = cus;
	} 
	
	public void billCalculation()		 			//function for bill generation for different categories
	{
		
		String cate =cus.getCustMembership().getCategory();
		if(cate.equalsIgnoreCase("gold"))
		{
			System.out.println("you get 15% discount");
			totalBill(15);
		}
		else if (cate.equalsIgnoreCase("premium"))
		{
			System.out.println("you get 20% discount");
			totalBill(20);
		}
		else if (cate.equalsIgnoreCase("silver"))
		{
			System.out.println("you get 10% discount");
			totalBill(10);
		}
		else
			totalBill(0);
	}
	
	public  void totalBill(int discount)				//function used to calculate bill
	{
		if(cus.getCustService().isEyebrowService())
			this.servicePrice =100;
		else if(cus.getCustService().isHairCutService())
			this.servicePrice = 1000;
		else if(cus.getCustService().isPedicureService())
			this.servicePrice = 500;
		else if(cus.getCustService().isHairWashService())
			this.servicePrice = 350;
		else this.servicePrice=0;
		
		int itmPrice = cus.getCustService().getItemPrice();
		int discountedPrice = (this.servicePrice*discount)/100;
		this.servicePrice = servicePrice - discountedPrice;
		this.totalPrice = itmPrice + discountedPrice;
		System.out.println("Your total bill after discount is: "+this.totalPrice);
	}

}
