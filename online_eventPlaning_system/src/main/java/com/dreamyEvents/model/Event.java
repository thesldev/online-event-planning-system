package com.dreamyEvents.model;

public class Event {
	private int eventId;
    private String title;
    private String eventType;
    private String address;
    private String city;
    private String Postalcode;
    private String guestnum;
    private String date;
    private String time;
    private String timeduration;
    private String TotalPrice;
    
    

	public Event(int eventId, String title, String eventType, String address, String city, String Postalcode, String guestnum, String date, String time, String timeduration, String TotalPrice) {
	this.eventId = eventId;
	this.title = title;
	this.eventType = eventType;
	this.address = address;
	this.city = city;
	this.Postalcode = Postalcode;
	this.guestnum = guestnum;
	this.date = date;
	this.time = time;
	this.timeduration = timeduration;
	this.TotalPrice = TotalPrice;
    }

    public int getEventId() {
        return eventId;
    }

    public String getTitle() {
        return title;
    }

    public String getEventType() {
        return eventType;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPostalcode() {
        return Postalcode;
    }
    public String getGuestnum() {
        return guestnum;
    }
    
   public String getDate() {
		return date;
   }


   public String getTime() {
		return time;
   }

   public String getTimeduration() {
		return timeduration;
   }

   public String getTotalPrice() {
		return TotalPrice;
  }

 
}


