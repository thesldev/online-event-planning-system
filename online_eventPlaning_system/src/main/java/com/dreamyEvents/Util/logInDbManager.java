package com.dreamyEvents.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class logInDbManager {
    // MySQL database connection details
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/online_eventplaning_system";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";

    // SQL query to check if the email and password exist in the database
    private static final String SQL_QUERY = "SELECT id FROM online_eventplaning_system.registeredseller WHERE email=? AND password=?";

    public static int validate(String email, String password) throws SQLException {
        int id = 0;

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DB_DRIVER);
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            stmt = conn.prepareStatement(SQL_QUERY);
            stmt.setString(1, email);
            stmt.setString(2, password);

            rs = stmt.executeQuery();

            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new SQLException(e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }

                if (stmt != null) {
                    stmt.close();
                }

                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
                throw new SQLException(e);
            }
        }

        return id;
    }
}
