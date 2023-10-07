package q3;

import java.util.Scanner;

public class Ticket {

	int ticketId;
	int price;
	static int availableTickets;
	
	public int calculateTicketCost(int noOFTickets) {
		
		if(noOFTickets <= availableTickets ) {
			availableTickets -= noOFTickets;
			return noOFTickets * price;
		}
		else {
			return -1;
		}
	}	
		
}
