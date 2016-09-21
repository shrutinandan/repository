import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class Program {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			Class.forName("com.mysql.jdbc.Driver");			//driver is called
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","root");	//connection is created
			PreparedStatement ps=con.prepareStatement("select * from emp");		//select statement is used 
			ResultSet rs=ps.executeQuery();			//execute the query
			ResultSetMetaData md=rs.getMetaData();		//metadata tell data about data tha is coloum name
			System.out.println(md.getColumnName(1)+" "+md.getColumnName(2)+" "+md.getColumnName(3));		//print the output
			while(rs.next())		//print the list
			{
				int id=rs.getInt(1);
				String name=rs.getString(2);				
				int salary=rs.getInt(3);
				System.out.println(id+" "+name+" "+salary);	//print the output
				
			}

			}
		}



