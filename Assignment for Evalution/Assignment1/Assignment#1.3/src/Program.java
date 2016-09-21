class Date
{
	private String dd;
	private String mm;
	private String yy;
	public Date()      //default constructor
	{
		
		this.dd = "00";
		this.mm = "00";
		this.yy = "0000";
	}
	public Date(String dd, String mm, String yy) //parmametrized constructor
	{
	
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
	
	
	
}
public class Program {
	public static void main(String[] args) {
	Date d1=new Date();  //default constructor is called
	Date d2=new Date("12","02","1994");		//parameterized constructor is called 
	System.out.println(d1); 		//printing the object values
	System.out.println(d2);			//printing the object values
	}

}
