import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;


public class Program {
	public static void main(String[] args) {
		Date d = new Date();
		Account acc = new Account("shruti",101,d,8000);
		
		 try 
		    {
		    	  FileOutputStream f=new FileOutputStream("D:\\shruti\\Assignment#8.2\\src\\File1");  
		  	      ObjectOutputStream out=new ObjectOutputStream(f);  
			      out.writeObject(acc);
				  out.flush(); 
				  out.close();  
				    f.close();  
			} 
		    catch (IOException e) 
		    {
				
				e.printStackTrace();
			}  
		    
		    
		    
		     
			  try 
			  {
				  ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:\\shruti\\Assignment#8.2\\src\\File1"));  
				  Account s=(Account)in.readObject();  
				  System.out.println(s);  
				  in.close();
			
			  } 
			  catch (IOException e) 
			  {
				
				e.printStackTrace();
			   } 
			  catch (ClassNotFoundException e) 
			  {
				
				e.printStackTrace();
			  }
		    System.out.println("task completed");
		   
		}
		
	
	}


