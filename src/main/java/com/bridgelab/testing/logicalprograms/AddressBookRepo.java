package com.bridgelab.testing.logicalprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddressBookRepo {
	Connection connection = null;

	public void connection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/address_book_db";
			String username = "root";
			String password = "mysql";
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException s) {
			throw new Error(s);
		} catch (ClassNotFoundException c) {
			throw new Error(c);
		}
	}

	public void add() {
		String name = UtilScanner.getString("Enter name: ");
		String city = UtilScanner.getString("Enter city: ");
		String contactNo = UtilScanner.getString("Enter contact no.: ");
		String query = "insert into address_book (USER_NAME,CITY_NAME,CONTACT_NO)" + "values (?,?,?)";
		try {
			connection();
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, city);
			preparedStatement.setString(3, contactNo);
			preparedStatement.execute();
			System.out.println("Added Successfully !!");
		} catch (SQLException e) {
			throw new Error(e);
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void delete() {
	}

	public void update() {
	}

	public void display() {
		String query = "SELECT * FROM address_book_db.address_book";
		try {
			connection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);
			while (resultSet.next()) {
				int id = resultSet.getInt("ID");
				String userName = resultSet.getString("USER_NAME");
				String cityName = resultSet.getString("CITY_NAME");
				String contactNo = resultSet.getString("CONTACT_NO");
				System.out.println(id + ". " + userName + ", " + cityName + ", " + contactNo);
			}
			statement.close();
		} catch (Exception e) {
			throw new Error(e);
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
