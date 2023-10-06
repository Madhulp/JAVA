package q2;

import java.util.Scanner;

public class Demo {


		public Hotel provideFood(int amount) {
			
			if(amount > 1000) {
				return new TajHotel();
			}
			else if(amount > 200 && amount<1000) {
				return new RoadSideHotel();
			}
			return null;
			
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int amount = sc.nextInt();
			
			if(amount == -1) {
				System.out.println("Enter Valid amount");
			}
			else {
				Demo d = new Demo();
				d.provideFood(amount);
			}
			
			RoadSideHotel r = new RoadSideHotel();
			r.chickenBiryani();
			r.masalaDosa();
			
			TajHotel t = new TajHotel();
			t.chickenBiryani();
			t.masalaDosa();
			t.welcomeDrink();
		}
////*****not correct
}
