package io.github.web.data.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MySqlJdbcCreateTable {

	public static void main(String[] args) throws Exception {
		// MySQL JDBC Driver
		Class.forName("com.mysql.jdbc.Driver");

		// Connection to MySql
		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test", "root", "");
		Statement statement = null;

		// Create table
		String createSql = "CREATE TABLE USER (ID_USER INT NOT NULL AUTO_INCREMENT, "
				+ "USERNAME VARCHAR(45) NULL, AGE INT NULL, "
				+ "CREATED_DATE DATE NOT NULL, PRIMARY KEY (ID_USER))";
		statement = connection.createStatement();
		statement.execute(createSql);
		statement.close();

		// Close connection
		connection.close();
	}

}
