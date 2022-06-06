package mysqljava1;
import java.sql.*;
public class pro1 {
public static void main(String[] args) {
		
		try{ Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/office","root","Kolli12para.");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from employee");
		while(rs.next())
		{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
		}
		}
		catch(Exception e)
		{
		System.out.println(e.toString());}


	}

}


