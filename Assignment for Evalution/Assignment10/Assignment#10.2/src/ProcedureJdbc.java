import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ProcedureJdbc {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {		 
		  
		try {
			 Class.forName("com.mysql.jdbc.Driver");		//driver name is given
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mysql", "root","root");		//connection is created
			  
			CallableStatement stmt=con.prepareCall("{call proc1(?)}"); 		//procedure is called
	
			stmt.execute();  			//execute the procedure
			System.out.println(stmt.getInt(1)); 
		} 
		
		catch (ClassNotFoundException  | SQLException e) 	//exception is catch
		{
			
			e.printStackTrace();
		}  
		
		  
		 
	}
}
