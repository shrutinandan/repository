import java.io.*;


public class Program {
	public static void main(String[] args) {
		DataInputStream ds = new DataInputStream(System.in);
		try {
			FileOutputStream fout = new FileOutputStream("D:\\Assignment#8.1\\src\\File1");
			char ca;
			while((ca=(char)ds.read())!='\n')
			{
				fout.write(ca);
			}
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	


	try
	{
	FileInputStream fin=new FileInputStream("D:\\Assignment#8.1\\src\\File1");  
	FileOutputStream fout=new FileOutputStream("D:\\Assignment#8.1\\src\\File2");  
	int i=0;  
	while((i=fin.read())!=-1)
	{  
	fout.write((byte)i);  
	}  
	fin.close();  
	}


catch (FileNotFoundException e) {

	e.printStackTrace();
       } catch (IOException e) {
	
	e.printStackTrace();
} 
	}
}

