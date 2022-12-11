package DesignPattern_Creational;
class Booking1{
	static Booking1 obj = new Booking1(100);
	static int totalTickets;
	
	private Booking1(int totalTickets) {
		Booking.totalTickets = totalTickets;
	}
	public static Booking1 bookTicket(int noOfBooking) {
		
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
public class MovieEger {
	public static void main(String[] args) {
		Booking.bookTicket(3);
		Booking.bookTicket(70);
		Booking.bookTicket(60);
	}
}
