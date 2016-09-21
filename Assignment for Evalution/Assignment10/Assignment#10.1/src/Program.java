

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


class Jdbc{	

	PreparedStatement stmnt=null;			//Initializing Prepared Statement	
	
	public Connection createConnection() throws ClassNotFoundException, SQLException  ////creating the connection
	{
		Class.forName("com.mysql.jdbc.Driver");											//loading driver name
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root","root");
		return con;	
	
	}


public void insert(Connection con) throws SQLException			//function to insert into table
{
	
	stmnt=con.prepareStatement("Insert into emp values(?,?,?)");
	stmnt.setInt(1, 7);
	stmnt.setString(2, "deepak");	
	stmnt.setInt(3, 4000);	
	int i=stmnt.executeUpdate();
	System.out.println("Reords Inserted :" +i);
	
}


public void update(Connection con) throws SQLException			//function to update into table
{

	stmnt=con.prepareStatement("Update emp set name=? where empid=?");
	stmnt.setString(2,"ruchi");
	stmnt.setInt(1,1);
	int i=stmnt.executeUpdate();
	System.out.println("Records Updated  :" +i);

}


public void closeResource(Connection con) throws SQLException 		//fuction to close all resources
{
	
	if(con!=null)
		con.close();
	if(stmnt!=null)
		stmnt.close();
		
}

}


public class Program {

public static void main(String[] args) {
	
	
	try {
		Jdbc j=new Jdbc();				//jdbc class object is created
		
		Connection con=j.createConnection();		//connection is created
		j.insert(con);						//insert is called
		j.update(con);						//update is called
		j.closeResource(con);				//resource is closed
		
		
	}
	catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	
}

}
