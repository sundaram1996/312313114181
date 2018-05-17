import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.ConnectionGroup;


public class FriendDAO {

	public FriendDAO()
	{
		 
		 PreparedStatement preparedStatemen = null;
		 ResultSet resultSet=null;
		 
	}
	
	public void connectToDatabase() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql:://localhost/frienddb","root","");
		Statement statement = connection.createStatement();
	
	}
	
}
