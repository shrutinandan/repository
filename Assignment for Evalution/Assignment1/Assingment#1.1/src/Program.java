import java.util.Scanner;

class Customer   //class customer is created
{
	private String name;   //datamember are declared
	private int age;
	private String address;
	
	public Customer(String name, int age, String address) //constructor is made
	{
	
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public String getName()    //getter method
	{
		return name;
	}
	public void setName(String name)  //setter method
	{
		this.name = name;
	}
	public int getAge()          //getter method
	{
		return age;
	}
	public void setAge(int age)    //setter method
	{
		this.age = age;
	}
	public String getAddress()      //getter method
	{
		return address;
	}
	public void setAddress(String address) //setter method
	{
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", address="
				+ address + "]";
	}
	
	
}
public class Program {
	static Scanner sc=new Scanner(System.in); //scnner is used to input
	public static void main(String[] args) {
		
		System.out.println("enter customer name");
		String name=sc.nextLine();		//inputing the value
		System.out.println("enter customer address");
		String address=sc.nextLine();   //inputing the value
		System.out.println("enter customer age");
		int age=sc.nextInt();           //inputing the value
		Customer c1=new Customer(name,age,address);  //object c1 is created of class customer
		System.out.println(c1);  //printing the value of objects
	}

}
