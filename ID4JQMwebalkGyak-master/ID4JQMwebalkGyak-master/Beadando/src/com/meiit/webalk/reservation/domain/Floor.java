package com.meiit.webalk.reservation.domain;

import java.util.List;

public class Floor {
	private int floornumber;
	private String hotel;
	//private
	List <Wing> wing;
	
	
	public Floor(int floornumber, List<Wing> wing) {
		super();
		this.floornumber = floornumber;
		this.wing = wing;
	}
	public int getFloornumber() {
		return floornumber;
	}
	public void setFloornumber(int floornumber) {
		this.floornumber = floornumber;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public List<Wing> getWing() {
		return wing;
	}
	public void setWing(List<Wing> wing) {
		this.wing = wing;
	}
}
