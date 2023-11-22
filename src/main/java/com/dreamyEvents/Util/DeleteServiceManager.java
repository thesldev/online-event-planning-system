package com.dreamyEvents.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteServiceManager {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/online_eventplaning_system";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public boolean deleteService(int sid) {
        boolean deleted = false;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish a connection to the database
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Create a prepared statement with a parameterized query to delete a service by sid
            String query = "DELETE FROM online_eventplaning_system.servicetable WHERE sid = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, sid);

            // Execute the statement to delete the service
            int rowsDeleted = statement.executeUpdate();

            // Check if the service was successfully deleted
            if (rowsDeleted > 0) {
                deleted = true;
            }

            // Close the statement and connection resources
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return deleted;
    }
}
