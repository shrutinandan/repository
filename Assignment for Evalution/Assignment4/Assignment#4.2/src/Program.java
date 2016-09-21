class Employee   //class employee is created
{
	private String name;
	private int age;
	private String city;
	public Employee(String name, int age, String city) //contructor is created
	{
		this.name = name;
		this.age = age;
		this.city = city;
	}
	@Override
	public String toString() //tostring method is called
	{
		return String.format("Employee [name=%s, age=%s, city=%s]", name, age,
				city);
	}
	
	
	
}
public class Program {
	public static void main(String[] args) {
		Employee emp =new Employee("shruti", 23, "pune"); //emp object is created
		System.out.println(emp); //before gc running
		System.gc();   //checking gc is running or not
		System.out.println(emp);  //gc is running
	}

}
