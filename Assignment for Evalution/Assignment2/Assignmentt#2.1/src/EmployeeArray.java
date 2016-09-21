class Employee  //class employee is created
{
		private String name;
		private int age;
		private static int count;
		
		public Employee() //default constructor
		{
			this.name = "";
			this.age = 0;
			count++;
		}

		public Employee(String name, int age)//parameterized constructor
		{
		
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + "]";
		}
		
		public String getName() //getter method
		{
			return name;
		}

		public void setName(String name) ////setter method
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

		public static int getCount() //getter method
		{
			return count;
		}

		public static void setCount(int count) ////setter method
		{
			Employee.count = count;
		}

		public static int getcount()  //function used to count the number of objects
		{
			return count;
			
		}
		
		
}
public class EmployeeArray {
public static void main(String[] args) {
	Employee emp1=new Employee(); //object emp1 is created
	Employee emp2=new Employee();  //object emp2 is created
	Employee emp3=new Employee();  //object emp3 is created
	Employee emp4=new Employee();  //object emp4 is created
	Employee emp5=new Employee();  //object emp5 is created
	System.out.println("Number of employee objects are:" +Employee.getcount()); //print the number of objects
	
}
}
