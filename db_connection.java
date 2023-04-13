package jdbc_simple_project;

import java.sql.*;

public class dbconnection {
	public static void main(String[] args) {
		
		//step-1 loadregister
		
		try {
			
			Driver driver =new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			String url=("jdbc:mysql://localhost:3306/view");
			String user ="root";
			String pass="root";
			
			Connection connection = DriverManager.getConnection(url,user,pass);
			System.out.println("connection established");
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
			
		}
	}
}
