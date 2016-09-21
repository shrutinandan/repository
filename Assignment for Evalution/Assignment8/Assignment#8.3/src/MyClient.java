import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;


public class  MyClient
{
	public static void main(String args[]) throws Exception
	{
		Socket sk=new Socket("172.27.60.96",6000);				//new socket connections are created
		BufferedReader sin=new BufferedReader(new InputStreamReader(sk.getInputStream()));	//bufferreader is created
		PrintStream sout=new PrintStream(sk.getOutputStream());				//printstream object is created
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));  	//buffer will contain all the value
		String s;
		while (  true )
		{
			System.out.print("Client : ");
			s=stdin.readLine();				//input for client is taken
			sout.println(s);
			s=sin.readLine();
			System.out.print("Server : "+s+"\n");
 			   break;
		}
		 sk.close();
		 sin.close();
		 sout.close();
 		stdin.close();
	}
}