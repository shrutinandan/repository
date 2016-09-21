
public class JointAccount 			//class JointAccount is created
{
	private int accountNumber;
	private String name;
	private double balance;
	
	public JointAccount(int accountNumber, String name, double salary) //constuctor is made
	{
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = salary;
	}

	public int getAccountNumber() 		//getter method
	{
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber)			//setter method
	{
		this.accountNumber = accountNumber;
	}

	public String getName() 		////getter method
	{
		return name;
	}

	public void setName(String name) 	//setter method
	{
		this.name = name;
	}

	public double getSalary() 		//getter method
	{
		return balance;
	}

	public void setSalary(double salary) 		//setter method
	{
		this.balance = salary;
	}

	@Override
	public String toString() {
		return String.format(
				"JointAccount [accountNumber=%s, name=%s, salary=%s]",
				accountNumber, name, balance);
	}
	
	public void deposit(double money)				////function for depositing money 
	{
		
		balance += money;
		System.out.println("Money deposited successfully");
	}
	
	
	public void withdraw(double moneytaken) 			//function  for withdrawing money
	{
		
		if(moneytaken < balance)
		{
			balance = balance - moneytaken;
			System.out.println(Thread.currentThread().getName() + "-> Money withdrawn successfully");
		}
		else
			System.out.println(Thread.currentThread().getName() + "-> Insufficeint Balance");
	}


}
