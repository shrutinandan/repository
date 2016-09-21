package com.cybage;

abstract class Membership 				//abstract class membership is created
{
	protected String category;
	protected int discount;
	
	
	
	public Membership(String category,int discount) 	//constructor
	{
		this.category = category;
		this.discount = discount;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public int getDiscount() {
		return discount;
	}



	public void setDiscount(int discount) {
		this.discount = discount;
	}
	
	
	
}




class Premium extends Membership		//inheritance(membership class is inherited into premium class)
{

	public Premium()
	{
		super("premium",20);
		
	}

	@Override
	public String toString() {
		return String.format("premium");
	}
	
	
}



class Gold extends Membership			//inheritance(membership class is inherited into goldclass)
{

	public Gold()
	{
		super("gold", 15);
		
	}

	@Override
	public String toString() {
		return String.format("gold");
	}
	
	
}





class Silver extends Membership					//inheritance(membership class is inherited into silver class)
{

	public Silver()
	{
		super("silver", 10);
		
	}

	@Override
	public String toString() {
		return String.format("silver");
	}
	
	
}