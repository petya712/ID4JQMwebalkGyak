package com.meiit.webalk.reservation.domain;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Reservaton {
	private String amount;
	private LocalDateTime from;
	private LocalDateTime to;
	private boolean active;
	private boolean processed;
	private String currency;
	private Room room;
	private String name;
	public Reservaton() {
		super();
	}
	

	public Reservaton(String name, Room r) {
		super();
		this.name = name;
		this.room=r;

	}

	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public LocalDateTime getFrom() {
		return from;
	}
	public void setFrom(LocalDateTime from) {
		this.from = from;
	}
	public LocalDateTime getTo() {
		return to;
	}
	public void setTo(LocalDateTime to) {
		this.to = to;
	}
	public boolean getActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean getProcessed() {
		return processed;
	}
	public void setProcessed(boolean processed) {
		this.processed = processed;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name = n;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	public String toString() {
		SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd");
		return "Your reservation is set for " + sdt.format(from) + ", in room " + room.getNumber() + ", under the name of " +getName();
	}
	
}
