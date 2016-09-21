



public class HolderType extends Thread		//class will extends thread
{
	
	private JointAccount account;
	private double moneytaken;
	
	
	
	
	public HolderType(String name,JointAccount account, double moneytaken)  	//constructor is created
	{
		super(name);
		this.account = account;
		this.moneytaken = moneytaken;
	}




	public void run()			//run method will decide the thread and execute it
	{
		
		System.out.println(Thread.currentThread().getName() + " starting the transaction");
		
		synchronized(account)			//synchronized the thread
		{
			account.withdraw(moneytaken);
		}

}
}