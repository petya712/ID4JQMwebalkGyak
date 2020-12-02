package com.meiit.webalk.reservation.domain;

import java.util.List;

public class Wing {
	private String description;
	private Floor floor;
	private List<Room> rooms;
	private WingType wingt;
	
	
	public Wing( WingType wingt, List<Room> rooms) {
		super();
		this.wingt = wingt;
		this.rooms = rooms;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Floor getFloor() {
		return floor;
	}
	public void setFloor(Floor floor) {
		this.floor = floor;
	}
	
	public List<Room> getRooms() {
		return rooms;
	}
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	public WingType getWingt() {
		return wingt;
	}
	public void setWingt(WingType wingt) {
		this.wingt = wingt;
	}
	
}
