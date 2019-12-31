package DBCON;
import java.sql.*;

public class Dbtest 
{

	public static void main(String[] args) throws Exception 
	{

		String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		Connection con=DriverManager.getConnection(  
				url,"scott","tiger");  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from emp");  
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
		}
		con.close();  

	}

}
