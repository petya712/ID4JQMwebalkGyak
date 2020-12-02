package com.meiit.webalk.reservation;

import com.meiit.webalk.reservation.domain.BookingPerson;
import com.meiit.webalk.reservation.domain.Reservaton;
import com.meiit.webalk.reservation.domain.Room;
import com.meiit.webalk.reservation.service.Service;
import com.meiit.webalk.reservation.view.View;

//Use meaningfull neames
public class App {
	//Should be private
	Service s;
	//This is not good, delete pls.
	App app;
	//Should be private
	View view;
	

	public static void main(String[] args) {
		App app=new App(new Service(), new View());
		app.createBookingPerson();
		app.book();
		app.checkIn();
		app.checkOut();
		

	}
	public App(Service s,View v) {
		this.s=s;
		this.view=v;
		s.init();
		
	}
	public void createBookingPerson() {
		BookingPerson bookingperson = view.readBookingPerson();
		s.saveBookingPerson(bookingperson);
		view.printBalance(bookingperson);
		
	}
	public void book() {
		Room r = null;
		 do {
			r = view.selectRoom(s.findAllHotels());
			if (r != null && s.findBookingperson().getBalance().compareTo(r.getPrice())>=0) {
				Reservaton newReservation = new Reservaton(s.findBookingperson().getName(), r);
				s.saveReservation(newReservation, view);
			}
			else if (r!=null && s.findBookingperson().getBalance().compareTo(r.getPrice())<0) {
				view.printNotEnoughBalance(s.findBookingperson());
			}
		}while (r!=null);
	}
	
	
	public void checkIn() {
		if(s.findAllReservation().isEmpty()==false) {
			view.printCheckIn();
		}
	}
	public void checkOut() {
		if(s.findAllReservation().isEmpty()==false) {
			view.printCheckOut();
			view.printBalance(s.findBookingperson());
		}
	}
}
