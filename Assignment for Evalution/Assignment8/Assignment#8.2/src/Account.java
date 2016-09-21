import java.io.Serializable;
import java.util.Date ;


public class Account implements Serializable{

	private String name;
	private int accountId;
	private Date doc;
	private transient double balance;
	

	

	public Account(String name, int accountId, Date d, double balance) {
		this.name = name;
		this.accountId = accountId;
		this.doc = d;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public Date getDoc() {
		return doc;
	}

	public void setDoc(Date doc) {
		this.doc = doc;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return String.format("Account [name=%s, accountId=%s, doc=%s]", name,
				accountId, doc);
	}
	
	
}
