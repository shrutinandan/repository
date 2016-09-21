

class Employee   //class Employee is created
{
	private String name;   //datamember are declared
	private int age;
	private String address;
	
	
	public Employee() {
	
		this.name ="default";
		this.age = 0;
		this.address ="default";
	}
	public Employee(String name, int age, String address) //constructor is made
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
	public String toString()     //method to print value
	{
		return "Customer [name=" + name + ", age=" + age + ", address="
				+ address + "]";
	}
	
	
}
public class Program {
	
	public static void main(String[] args) {
		
		
		Employee c1=new Employee();  //object c1 is created of class customer and default constructor is called
		Employee c2=new Employee("shruti",23,"P-191");   //object c2 is created of class Employee and parameterized constructor is called
		
		
		System.out.println(c1);  //printing the value of objects
		System.out.println(c2);  //printing the value of objects
	}

}
