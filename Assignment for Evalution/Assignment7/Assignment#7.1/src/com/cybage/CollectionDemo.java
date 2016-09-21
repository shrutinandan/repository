package com.cybage;

import java.util.TreeSet;

class Employee implements Comparable<Employee> //class Employee is created 
{
	private int empId;
	private String name;
	private double salary;
	public Employee() {
		this.empId = 0;
		this.name = "";
		this.salary = 0.0;
	}
	public Employee(int empId, String name, double salary) //constructor of employee class is created
	{
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpId() 	//getter method
	{
		return empId;
	}
	public void setEmpId(int empId) 	//setter method
	{
		this.empId = empId;
	}
	public String getName()		//getter method
	{
		return name;
	}
	public void setName(String name) //setter method
	{
		this.name = name;
	}
	public double getSalary() 		//getter method
	{
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return String.format("Employee [empId=%s, name=%s, salary=%s]", empId,
				name, salary);
	}
	@Override
	public int compareTo(Employee o) //method to compare with empId
	{
	
	if(this.empId>o.empId)
	return 1;
	else if(this.empId<o.empId)
			return -1;
	else
	return 0;
	}
	
}//Employee class ends here

public class CollectionDemo 	//main class is created
{
	public static void main(String[] args) {
		   
		TreeSet<Employee> s=new TreeSet<Employee>();	//treeset is created
		s.add(new Employee(6,"shruti",1000));			//elements are added into the set
		s.add(new Employee(3,"shradha",1002));			//elements are added into the set
		s.add(new Employee(7,"saumya",1002));			//elements are added into the set
		s.add(new Employee(1,"Rahul",1002));
		s.add(new Employee(3,"Sohan",1002));
		s.add(new Employee(2,"Vijay",1002));
		
		
		System.out.println(s);			//sorted set will display in sorted order
		
	}

}//main class ends here
