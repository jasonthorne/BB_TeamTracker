package application;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import database.ConnectDB;

public class RemoteConnectionTest {

	public static void main(String[] args) throws SQLException {
		
		
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			
			
			//3 - get a connection to the db:
			
			Connection connection = ConnectDB.getConnection();
			
			System.out.println("Connection successfull!\n");
			
			//---------------------------------------------------
			//4 - test connection:
			
			//prepare statement:
			statement = connection.createStatement(); //create a statement using connection
			String sql = "select * from users";
			resultSet = statement.executeQuery(sql); //execute statement, storing results in resultSet
			
			while(resultSet.next()) {
				System.out.println(resultSet.getString("name") + " " + resultSet.getInt("ip")
				+ " " + resultSet.getInt("port"));
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if (resultSet != null){
				resultSet.close(); //close reult set!! +++++++++++
			}
		}
	

	}

}
