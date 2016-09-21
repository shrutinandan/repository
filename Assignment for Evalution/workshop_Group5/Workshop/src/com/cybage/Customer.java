package com.cybage;

class Customer						//customer class is created 
	{
	private String name;
	private int customerId;
	private Membership custMembership;
	private Service custService;
	
	public Customer(String name, int customerId, Membership custMembership,
			Service custService) {
		this.name = name;
		this.customerId = customerId;
		this.custMembership = custMembership;
		this.custService = custService;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Membership getCustMembership() {
		return custMembership;
	}
	public void setCustMembership(Membership custMembership) {
		this.custMembership = custMembership;
	}
	public Service getCustService() {
		return custService;
	}
	public void setCustService(Service custService) {
		this.custService = custService;
	}
	@Override
	public String toString() {
		return String
				.format("Customer [name=%s, customerId=%s, custMembership=%s, custService=%s]",
						name, customerId, custMembership, custService);
	}
	
	
}
