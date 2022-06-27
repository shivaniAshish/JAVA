
package com.iq.connection.utill;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionClass {
	private static Connection connection = null;
	
	private static Properties properties=null;
	static {
		try {
			properties=new Properties();
			properties.load(ConnectionClass.class.getClassLoader().getResourceAsStream("com/iq/ems/dbproperties/db.properties"));
			Class.forName(properties.getProperty("driver"));
			connection = DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("userName"),properties.getProperty("passWord"));
		} catch (ClassNotFoundException e) {
			e.getMessage();
		} catch (SQLException e) {
			e.getMessage();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return connection;
	}

	public static Connection openConnection() {
		return connection;
	}

	
	public static void closeConnection(Connection connection) {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void closeConnection(Connection connection, Statement statement) {
		if (statement != null) {
			try {
				closeConnection(connection);
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public static void closeConnection(Connection connection,Statement statement, ResultSet rs) {
		if(rs!=null) {
			try {
				closeConnection(connection,statement);
				rs.close();
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		System.out.println(openConnection());
	}

}
