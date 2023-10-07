package q2;

import java.util.Scanner;

public class Demo {


		public Hotel provideFood(int amount) {
			
			if(amount > 1000) {
				return new TajHotel();
			}
			else if(amount > 200 && amount<=1000) {
				return new RoadSideHotel();
			}
			return null;
			
		}
		
		public static void main(String[] args) {
			
			
			Demo d = new Demo();
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the amount: ");
			int amount = sc.nextInt();
			
			Hotel h = d.provideFood(amount);
			if(h != null) {
				h.chickenBiryani();
				h.masalaDosa();
				
				if(h instanceof TajHotel) {
					((TajHotel)h).welcomeDrink();
				}
			}
		
			else {
				System.out.println("Please enter valid amount...");
			}
			sc.close();

		}

}
