package q3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of booking: ");
		int noOfBooking = sc.nextInt();
		
		System.out.println("Enter the available tickets: ");
		int availableTickets = sc.nextInt();
		
		for(int i=0; i<noOfBooking; i++) {
			Ticket t = new Ticket();
			
			System.out.println("Enter ticketId: ");
			t.ticketId = sc.nextInt();
			
			System.out.println("Enter the price: ");
			t.price = sc.nextInt();
			
			System.out.println("Enter no. of ticket: ");
			int noOfTickets = sc.nextInt();
			
			int totalAmount = t.calculateTicketCost(noOfTickets);
			
			if(totalAmount != -1) {
				System.out.println("Available ticket: "+t.availableTickets);
				System.out.println("Total Amount: "+totalAmount);
				System.out.println("Avaibla ticket after booking"+t.availableTickets);
			}
			else {
				System.out.println("Ticket not vaialable.");
			}
		}
		sc.close();
	}

}
