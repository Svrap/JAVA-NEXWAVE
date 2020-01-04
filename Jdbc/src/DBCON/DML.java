package DBCON;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DML {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement stmt = null;
		//ResultSet rs=null;
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  

			//step2 create  the connection object  
			con=DriverManager.getConnection(  
					"jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");  
			//con.setAutoCommit(false);
//for inserting the values
			stmt= con.prepareStatement("insert into abc values(?,?,?)");
			stmt.setInt(1, 10); 
			stmt.setString(2, "chandu"); 
			stmt.setDouble(3, 3000);
			int count = stmt.executeUpdate();
			System.out.println(count+ " Rows Inserted");
			con.rollback();
			stmt.setInt(1, 11); 
			stmt.setString(2, "abc"); 
			stmt.setDouble(3, 3000);
			count = stmt.executeUpdate();
			System.out.println(count+ " Rows Inserted");
			con.commit();
//for updating the values
			stmt = con.prepareStatement("update abc set sal=? where id=?");
			stmt.setDouble(1, 1100); stmt.setInt(2, 11);
			 count = stmt.executeUpdate();
			System.out.println(count + " Rows Updated");
			
//for deleting the values
			stmt = con.prepareStatement("delete from abc  where id=?");
			stmt.setDouble(1, 10); 
			 count = stmt.executeUpdate();
			System.out.println(count + " Rows deleted");


		}
		catch(Exception e)
		{ 
			System.out.println(e);
			}  
		finally
		{
			try
			{
				//if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
}