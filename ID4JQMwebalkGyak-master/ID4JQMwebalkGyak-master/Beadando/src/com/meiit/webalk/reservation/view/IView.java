package com.meiit.webalk.reservation.view;

import java.util.List;

import com.meiit.webalk.reservation.domain.BookingPerson;
import com.meiit.webalk.reservation.domain.Reservaton;
import com.meiit.webalk.reservation.domain.Room;
import com.meiit.webalk.reservation.domain.Reservaton;
import com.meiit.webalk.reservation.domain.Hotel;

public interface IView {
	public BookingPerson readBookingPerson();
	public void printWelcomeMessage(BookingPerson bp);
	public void printBalance(BookingPerson bp);
	public void printRoom(List<Hotel> h);
	public Room selectRoom(List<Hotel> hotels);
	public void printReservationSaved(Reservaton r);
	public void printReservations(List<Reservaton> res);
	public void printNotEnoughBalance(BookingPerson bp);
	public void printCheckIn();
	public void printCheckOut();
	

}
