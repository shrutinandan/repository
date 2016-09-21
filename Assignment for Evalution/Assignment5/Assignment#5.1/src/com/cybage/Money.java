package com.cybage;

public class Money {
	int fee;

	public Money()
	{
		this.fee=120050;
	}
	public int getFee() {
		return fee;
	}

	@Override
	public String toString() {
		return String.format("Money [fee=%s]", fee);
	}
	

}
