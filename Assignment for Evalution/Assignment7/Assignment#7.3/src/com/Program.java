package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class 	Book			//class book is created
{
	private int bookId;
	private String name;
	private int noOfPages;
	
	public Book() 			//contructor is created
	{
		this.bookId =0;
		this.name = "";
		this.noOfPages =0;
	}
	public Book(int bookId, String name, int price) //parameterized contructor is created
	{
		this.bookId = bookId;
		this.name = name;
		this.noOfPages = price;
	}
	public int getBookId() 				//getter method	
	{
		return bookId;
	}
	public void setBookId(int bookId) //setter method
	{
		this.bookId = bookId;
	}
	public String getName() 		//getter method
	{
		return name;
	}
	public void setName(String name) 	//setter method
	{
		this.name = name;
	}
	public int getPrice() 				//getter method
	{
		return noOfPages;
	}
	public void setPrice(int price) 	//setter method
	{
		this.noOfPages = price;
	}
	@Override
	public String toString() 		{
		return String.format("Book [bookId=%s, name=%s, price=%s]", bookId,
				name, noOfPages);
	}
	@Override
	public int hashCode() 			//hashcode method gets override
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + bookId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfPages;
		return result;
	}
	@Override
	public boolean equals(Object obj) 		//equals method gets override
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookId != other.bookId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfPages != other.noOfPages)
			return false;
		return true;
	}
	
	
	
}

public class Program {
	public static void main(String[] args) {
		Map<Integer, Book> m=new HashMap<>();		//map collection is used in which whole entry is done in hashmap
		m.put(1, new Book(1,"java",50));			//book values and keys are added into  the list
		m.put(2, new Book(2,"dotnet",60));			//book values and keys are added into  the list
		m.put(3, new Book(3,"maths",100));			//book values and keys are added into  the list
		m.put(4, new Book(4,"french",500));			//book values and keys are added into  the list
		
		
		Iterator<Map.Entry<Integer, Book>> entries = m.entrySet().iterator(); //list is iterated
		while (entries.hasNext())
		{
		    Map.Entry<Integer, Book> entry = entries.next();
		    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); //ityerated list is printed
		}
	}

}
