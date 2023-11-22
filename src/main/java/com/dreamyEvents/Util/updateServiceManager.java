package com.dreamyEvents.Util;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dreamyEvents.model.Services;

public class updateServiceManager {

	private String dburl="jdbc:mysql://localhost:3306/online_eventplaning_system";
	private String dbuname = "root";
	private String dbpassword= "";
	private String dbdriver = "com.mysql.jdbc.Driver";
	
	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		
		
		Connection con = null;
		try {
			con=DriverManager.getConnection(dburl, dbuname, dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return con;
	}
	
	
public String update(Services services,int sid) {
		
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result= "data Updated successfully";
		
		String sql="UPDATE online_eventplaning_system.servicetable SET service_name = ?, service_description = ?, service_price = ?, contact_number = ?, contact_email = ?, service_type = ?   WHERE sid = ?";
		
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, services.getService_name());
			ps.setNString(2, services.getService_description());
			ps.setDouble(3, services.getService_price());
			ps.setInt(4, services.getContact_number());
			ps.setNString(5, services.getContact_email());
			ps.setString(6, services.getService_type());
			ps.setInt(7, sid);
			ps.executeUpdate();
			result = "SUCCESS";
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			result="data entered not successfully.";
		}
		return result;
	}
	
	
	
}
