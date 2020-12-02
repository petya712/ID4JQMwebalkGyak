package com.meiit.webalk.reservation.service;

import java.util.Scanner;

import com.meiit.webalk.reservation.domain.BookingPerson;
import com.meiit.webalk.reservation.domain.Reservaton;
import com.meiit.webalk.reservation.view.View;
import com.meiit.webalk.reservation.domain.Hotel;
import com.meiit.webalk.reservation.domain.Reservaton;
import java.util.List;

public interface ReservationService {
	
	public void saveBookingPerson(BookingPerson bp); 
	public BookingPerson findBookingperson();
	public List<Hotel> findAllHotels();
	public void saveReservation(Reservaton r, View v);
	public List<Reservaton> findAllReservation();
	public void checkIn(Reservaton r);
	public void checkOut(Reservaton r);
	public void init();
}
