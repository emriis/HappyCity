package fr.av.dal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PoolConnection {

	public static Connection getConnection(String database, String userBDD,String password) throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String connectionUrl = "jdbc:sqlserver://localhost;database=" + database + ";";
		Connection cnx = DriverManager.getConnection(connectionUrl, userBDD, password);
		return cnx;
	}

}
