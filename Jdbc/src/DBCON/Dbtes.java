package DBCON;
import java.sql.*;  
class Dbtes{  
	@SuppressWarnings("resource")
	public static void main(String args[]){ 
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs=null;
		try{  
//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  

//step2 create  the connection object  
			con=DriverManager.getConnection(  
					"jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");  

//step3 create the statement object  
//stmt= con.prepareStatement("select * from movies");
			stmt= con.prepareStatement("select * from dept");
			rs = stmt.executeQuery();
 //for resutlsetmetadata
			ResultSetMetaData rasmd = rs.getMetaData();
			int count = rasmd.getColumnCount();
			for (int i = 1; i <= count; i++) {
				System.out.print(rasmd.getColumnName(i)+"	");
							
			}
			System.out.println();
			while(rs.next()) 
			{  
				for (int i = 1; i <= count; i++) {
					System.out.print(rs.getString(i)+" ");
				}
				System.out.println();
			}
			System.out.println("\n");
//for scrollable resultset
		stmt = con.prepareStatement("select * from dept",ResultSet.TYPE_SCROLL_SENSITIVE,
				ResultSet.CONCUR_READ_ONLY);
		rs = stmt.executeQuery();
		while (rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
		}
		System.out.println();
		while (rs.previous()) {
			
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
		}
		catch(Exception e)
		{ 
			System.out.println(e);
			}  
		finally
		{
			try
			{
				if(rs!=null) rs.close();
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