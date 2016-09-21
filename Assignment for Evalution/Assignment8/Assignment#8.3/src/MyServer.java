import java.net.*;
import java.io.*;
 
public class MyServer
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket s=new ServerSocket(6000);				//serversocket object is created
		Socket sk=s.accept();								//accept object of method class is created
		BufferedReader cin= new BufferedReader(new InputStreamReader(sk.getInputStream())); //buffer reader will take a input 
		PrintStream out=new PrintStream(sk.getOutputStream());  //output stream will come into input stream
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		String s1;
		while (  true )
		{
			s1=cin.readLine();						//accept the data
  			if (s1.equalsIgnoreCase("END"))			//condition is checked
  			{
  				out.println("BYE");
    				break;
  			  }
			System. out.print("Client : "+s+"\n");		//client input is print
			System.out.print("Server : ");
			s1=stdin.readLine();		//server input is taken
			out.println(s);				//server output is print
		}
		s.close();						//server socket is closed
 		sk.close();						// socket is closed
 		cin.close();					//input is closed
		out.close();					//printstream is closed
 		stdin.close();					//BufferedReader  is closed
	}	

	
}
 