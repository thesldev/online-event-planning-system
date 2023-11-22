package com.dreamyEvents.model;

public class Services {
	private String service_name;
	private String service_description;
	private Double service_price;
	private int contact_number;
	private String contact_email;
	private String service_type;
	private int uid;
	private int sid;
	
	
	public Services(String service_name, String service_description, Double service_price, int contact_number,
			String contact_email, String service_type, int uid, int sid) {
		super();
		this.service_name = service_name;
		this.service_description = service_description;
		this.service_price = service_price;
		this.contact_number = contact_number;
		this.contact_email = contact_email;
		this.service_type = service_type;
		this.uid = uid;
	}


	public Services() {
		super();
	}


	public String getService_name() {
		return service_name;
	}


	public void setService_name(String service_name) {
		this.service_name = service_name;
	}


	public String getService_description() {
		return service_description;
	}


	public void setService_description(String service_description) {
		this.service_description = service_description;
	}


	public Double getService_price() {
		return service_price;
	}


	public void setService_price(Double service_price) {
		this.service_price = service_price;
	}


	public int getContact_number() {
		return contact_number;
	}


	public void setContact_number(int contact_number) {
		this.contact_number = contact_number;
	}


	public String getContact_email() {
		return contact_email;
	}


	public void setContact_email(String contact_email) {
		this.contact_email = contact_email;
	}


	public String getService_type() {
		return service_type;
	}


	public void setService_type(String service_type) {
		this.service_type = service_type;
	}


	public int getUid() {
		return uid;
	}


	public void setUid(int uid) {
		this.uid = uid;
	}
	
	public int getSid() {
		return uid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}
	
	
	
	
	
	
}
