package com.supermarket.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    private static final String URL = "jdbc:h2:./supermarket_db"; // Stored in project root
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void initializeDatabase() {
        try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {

            // Create Users Table
            String createUsersTable = "CREATE TABLE IF NOT EXISTS users (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "username VARCHAR(255) UNIQUE NOT NULL, " +
                    "password VARCHAR(255) NOT NULL, " +
                    "gender VARCHAR(50), " +
                    "dob VARCHAR(50)" +
                    ");";
            stmt.execute(createUsersTable);

            // Create Products Table
            String createProductsTable = "CREATE TABLE IF NOT EXISTS products (" +
                    "id INT PRIMARY KEY, " +
                    "name VARCHAR(255) NOT NULL, " +
                    "quantity INT DEFAULT 0, " +
                    "price DOUBLE NOT NULL, " +
                    "category VARCHAR(255)" +
                    ");";
            stmt.execute(createProductsTable);

            // Create Invoices Table
            String createInvoicesTable = "CREATE TABLE IF NOT EXISTS invoices (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "date VARCHAR(50), " +
                    "client_name VARCHAR(255), " +
                    "total_price DOUBLE, " +
                    "staff_id INT" +
                    ");";
            stmt.execute(createInvoicesTable);

            System.out.println("Database tables initialized successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
