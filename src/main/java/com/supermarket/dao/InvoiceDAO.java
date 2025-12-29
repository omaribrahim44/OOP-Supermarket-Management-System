package com.supermarket.dao;

import com.supermarket.model.Invoice;
import com.supermarket.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InvoiceDAO {

    public void saveInvoice(Invoice invoice) {
        String sql = "INSERT INTO invoices (date, client_name, total_price, staff_id) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, invoice.getTransactionDate());
            pstmt.setString(2, "Walk-in Client"); // Simplified for now
            pstmt.setDouble(3, invoice.getTotalfinalprice());
            pstmt.setInt(4, invoice.getId_stuff());

            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
