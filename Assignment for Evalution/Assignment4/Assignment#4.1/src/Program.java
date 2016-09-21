class Employee   //Employee class is created
{
	private int empId;
	private String name;
	private int age;
	
	public Employee() {
		this.empId = 0;
		this.name = "";
		this.age = 0;
	}
	public Employee(int empId, String name, int age) {
		this.empId = empId;
		this.name = name;
		this.age = age;
	}
	public int getEmpId()  //getter method
	{
		return empId;
	}
	public void setEmpId(int empId) //setter method
	{
		this.empId = empId;
	}
	public String getName() //getter method
	{
		return name;
	}
	public void setName(String name) //setter method
	{
		this.name = name;
	}
	public int getAge() //getter method
	{
		return age;
	}
	public void setAge(int age) //setter method
	{
		this.age = age;
	}
	
	@Override
	public int hashCode()             //override hashcode method
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + empId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj)   //override equals method
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (empId != other.empId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString()                //override tostring method
	{
		return String.format("Employee [empId=%s, name=%s, age=%s]", empId,
				name, age);
	}
	
	
}
class Account
{
	double amount;

	public Account() {
		this.amount = 0.0;
	}

	public Account(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
    
	
	@Override
	public int hashCode()      //override hashcode method
	{
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) //override equals method
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (Double.doubleToLongBits(amount) != Double
				.doubleToLongBits(other.amount))
			return false;
		return true;
	}

	@Override
	public String toString()   //override tostring method
	{
		return String.format("Account [amount=%s]", amount);
	}
	
	
}
public class Program {
	public static void main(String[] args) {
		Employee emp1=new Employee(16720,"shruti",23);
		Employee emp2=new Employee(16719,"shradha",23);
		Employee emp3=new Employee(16720,"shruti",23);
		System.out.println("for employee class :" +emp1.equals(emp2));
		System.out.println("for employee class :" +emp1.equals(emp3));
		
		Account acc1=new Account(14000);
		Account acc2=new Account(14000);
		System.out.println("for account class :" +acc1.equals(acc2));
	
	}

}
