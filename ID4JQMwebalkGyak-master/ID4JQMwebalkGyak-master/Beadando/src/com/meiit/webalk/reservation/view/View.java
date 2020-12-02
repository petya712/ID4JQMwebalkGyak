package com.meiit.webalk.reservation.view;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import com.meiit.webalk.reservation.domain.BookingPerson;
import com.meiit.webalk.reservation.domain.Currency;
import com.meiit.webalk.reservation.domain.Floor;
import com.meiit.webalk.reservation.domain.Reservaton;
import com.meiit.webalk.reservation.service.ReservationService;
import com.meiit.webalk.reservation.domain.Hotel;
import com.meiit.webalk.reservation.domain.Wing;
import com.meiit.webalk.reservation.domain.WingType;
import com.meiit.webalk.reservation.domain.Room;

public class View implements IView {
	Scanner sc = new Scanner(System.in);

	@Override
	public BookingPerson readBookingPerson() {
		BookingPerson bp;
		System.out.println("What is your name?");
		String name = sc.nextLine();

		System.out.println("How much money do you have?");
		BigDecimal mon = sc.nextBigDecimal();
		sc.nextLine();

		System.out.println("What is your currency?");
		Currency curr = Currency.valueOf(sc.nextLine().toUpperCase());
		bp = new BookingPerson(name, mon, curr);
		printWelcomeMessage(bp);
		return bp;
	}

	@Override
	public void printWelcomeMessage(BookingPerson bp) {
		System.out.println("Welcome " + bp.getName() + "!");

	}

	@Override
	public void printBalance(BookingPerson bp) {
		System.out.println("Your balance is " + bp.getBalance() + " " + bp.getCurrency());

	}

	@Override
	public void printRoom(List<Hotel> hotels) {

	
		System.out.println(
				"Choose where would you like to book \nEnter the number of the room or q if you don't want to book.");
		int i = 0;
		for (Hotel h : hotels) {
			for (Floor f : h.getFloors()) {
				for (Wing w : f.getWing()) {
					for (Room r : w.getRooms()) {
						i++;
						System.out.println(i + ", Hotel name: " + h.getName() + ", Floor number: " + f.getFloornumber()
								+ ", Wing: " + w.getWingt() + ", Room number: " + r.getNumber() + ", Beds: "
								+ r.getBeds() + ", Room Price: " + r.getPrice());
					}
				}
			}
		}

	}

	@Override
	//Not need to rewrite this is just self improvement
	public Room selectRoom(List<Hotel> hotels) {
		
		boolean done = false;
		Room rm = null;
		printRoom(hotels);
		char c = sc.next().charAt(0);
		//This while should be in the app and call selectRoom
		//U can avoid return null.
		while (!done) {
			if (c == 'q') {
				System.out.println("Quit booking;");
				//Never return null
				return null;
			} else {
				printRoom(hotels);
				if (Character.isDigit(c)) {
					int chosen = Integer.parseInt(String.valueOf(c));
					int i = 0;
					for (Hotel h : hotels) {
						for (Floor f : h.getFloors()) {
							for (Wing w : f.getWing()) {
								for (Room r : w.getRooms()) {
									i++;
									if (chosen == i) {
										rm = r;
										//Return is not need if the logic in the good place 
										return rm;
									}
								}
							}
						}
					}
				}
			}
		}
		//Thats the only one which placed well.
		return rm;
	}

	@Override
	public void printReservationSaved(Reservaton r) {
		System.out.println("Reservation saved");

	}
	public void printReservations(List<Reservaton> res) {
		System.out.println("Your reservations: ");
		for (Reservaton r : res)
			System.out.println(r.toString());
	
	}

	@Override
	public void printNotEnoughBalance(BookingPerson bp) {
		System.out.println("Not enough balance, please choose another room ");

	}

	@Override
	public void printCheckIn() {
		System.out.println("Check in");

	}

	@Override
	public void printCheckOut() {
		System.out.println("Check out! \nSurprise, you are our 100th guest! You got a 10% refund");

	}

}
