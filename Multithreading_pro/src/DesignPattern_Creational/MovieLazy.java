package DesignPattern_Creational;
class Booking{
	static Booking obj;
	static int totalTickets;
	
	private Booking(int totalTickets) {
		Booking.totalTickets = totalTickets;
	}
	public static Booking bookTicket(int noOfBooking) {
		if(obj==null) {
			obj = new Booking(100);
		}
		System.out.println("tickets available "+totalTickets);
		System.out.println("booking "+noOfBooking+" tickets");
		if(noOfBooking > totalTickets) {
			System.out.println("tickets not available...");
			return obj;
		}
		System.out.println("tickets booked "+noOfBooking);
		totalTickets -= noOfBooking;
		System.out.println("ticket left "+totalTickets);
		return obj;
	}
}
public class MovieLazy {
	public static void main(String[] args) {
		Booking.bookTicket(30);
		Booking.bookTicket(70);
		Booking.bookTicket(30);
	}
}
