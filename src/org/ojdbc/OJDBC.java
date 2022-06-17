package org.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;

public class OJDBC {
WebDriver driver;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:xe","hr","vidhun14#");
		String s = "Select * from employees";
		PreparedStatement ps = connection.prepareStatement(s);
		ResultSet eq = ps.executeQuery();
		while (eq.next()) { 
		int int1 = eq.getInt("employee_id");
		System.out.println(int1);
		 String string = eq.getString("First_name");
		System.out.println(string);
		String string2 = eq.getString("Last_name");
		System.out.println(string2);
		String concat = string.concat(string2);
		System.out.println("************");
		System.out.println(concat);
		System.out.println("************");
		int int11 = eq.getInt("Salary");
		System.out.println(int11);

		connection.close(); 
			
			
		}
	}

}
