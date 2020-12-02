package com.meiit.webalk.reservation.service;

import java.util.ArrayList;

import com.meiit.webalk.reservation.domain.BookingPerson;
import com.meiit.webalk.reservation.domain.Reservaton;
import java.util.List;
import java.math.BigDecimal;
import com.meiit.webalk.reservation.domain.Hotel;
import com.meiit.webalk.reservation.domain.Floor;
import com.meiit.webalk.reservation.domain.Room;
import com.meiit.webalk.reservation.domain.Wing;
import com.meiit.webalk.reservation.domain.WingType;
import com.meiit.webalk.reservation.view.View;



public class Service implements ReservationService{
	private BookingPerson bookingp;
	private List<Reservaton> reservations= new ArrayList<Reservaton>();
	private List<Hotel> hotel=new ArrayList<Hotel>();
	//Why? We only have 1 poerson right now please change based on this
	private List<BookingPerson> bookingpersons=new ArrayList<BookingPerson>(); 
	
	@Override
	public void saveBookingPerson(BookingPerson bp) {
		//NOK
		bookingpersons.add(bp);
		
	}

	@Override
	public BookingPerson findBookingperson() {
		//NOK
		return this.bookingpersons.get(0);
	}
	@Override
	public void init() {
		List<Room> rooms = new ArrayList<Room>();
		List<Wing> wingeast = new ArrayList<Wing>();
		List<Wing> wingnorth = new ArrayList<Wing>();
		List<Floor> floors = new ArrayList<Floor>();
		rooms.add(0,new Room(1, 2, false, BigDecimal.valueOf(500), WingType.EAST));
		rooms.add(1,new Room(2, 3, false, BigDecimal.valueOf(1500), WingType.EAST));
		rooms.add(2,new Room(3, 2, false, BigDecimal.valueOf(1000), WingType.EAST));
		rooms.add(3,new Room(4, 2, false, BigDecimal.valueOf(2000), WingType.NORTH));
		rooms.add(4,new Room(5, 1, false, BigDecimal.valueOf(1900), WingType.NORTH));
		rooms.add(5,new Room(6, 3, false, BigDecimal.valueOf(1450), WingType.NORTH));
		wingeast.add(new Wing(WingType.EAST, rooms.subList(0, 3)));
		wingnorth.add(new Wing(WingType.NORTH, rooms.subList(3, 6)));
		floors.add(new Floor(1, wingeast));
		floors.add(new Floor(2, wingeast));
		floors.add(new Floor(3, wingeast));
		floors.add(new Floor(1, wingnorth));
		hotel.add(new Hotel("Dallas", "Elm Street 1015", 4, floors));
	}

	@Override
	public List<Hotel> findAllHotels() {
		
		
		return hotel;
		
	}
	

	@Override
	public void saveReservation(Reservaton r,View v) {
		reservations.add(r);
		
	}

	@Override
	public List<Reservaton> findAllReservation() {
		return reservations;
		
	}

	@Override
	public void checkIn(Reservaton r) {
		r.setActive(true);
		
	}

	@Override
	public void checkOut(Reservaton r) {
		r.setActive(false);
		r.setProcessed(true);
		//Refund calculation should be here
		
	}
	

}
