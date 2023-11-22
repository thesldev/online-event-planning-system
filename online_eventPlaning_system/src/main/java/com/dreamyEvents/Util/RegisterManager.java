package com.dreamyEvents.Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.dreamyEvents.model.RSeller;

public class RegisterManager {
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
	
	public String insert(RSeller rseller) {
		
		loadDriver(dbdriver);
		Connection con = getConnection();
		String result= "data entered successfully";
		
		String sql="insert into online_eventplaning_system.registeredseller values(NULL,?,?,?,?,?)";
		
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, rseller.getUser_name());
			ps.setString(2, rseller.getEmail());
			ps.setString(3, rseller.getPassword());
			ps.setString(4, rseller.getFirest_name());
			ps.setString(5, rseller.getLast_name());
			ps.executeUpdate();
			result = "SUCCESS";
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="data entered not successfully.";
		}
		
		return result;
	}
	
	
	
}
