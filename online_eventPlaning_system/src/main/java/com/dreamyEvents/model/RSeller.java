package com.dreamyEvents.model;

public class RSeller {

	private String user_name;
	private String email;
	private String password;
	private String firest_name;
	private String last_name;
	
	
	public RSeller(String user_name, String email, String password, String firest_name, String last_name) {
		super();
		this.user_name = user_name;
		this.email = email;
		this.password = password;
		this.firest_name = firest_name;
		this.last_name = last_name;
	}
	public RSeller() {
		super();
	}
	
	
	
	
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirest_name() {
		return firest_name;
	}
	public void setFirest_name(String firest_name) {
		this.firest_name = firest_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
}
