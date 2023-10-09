package q6;

import java.util.Scanner;

public class Main {
	
	public static double getStudent(int choice) {
		Scanner sc = new Scanner(System.in);
		if(choice==1) {
			System.out.println("Enter the Marks for Hindi: ");
			int hindiMarks = sc.nextInt();
			System.out.println("Enter the Marks for English: ");
			int englishMarks = sc.nextInt();
			System.out.println("Enter the Marks for History: ");
			int historyMarks = sc.nextInt();
			
			ArtStudent art = new ArtStudent(hindiMarks, englishMarks, historyMarks);
		    return art.findPercentage();
		}
		else if(choice == 2) {
			System.out.println("Enter the Marks for Physics: ");
			int physicsMarks = sc.nextInt();
			System.out.println("Enter the Marks for Chemistry: ");
			int chemMarks = sc.nextInt();
			System.out.println("Enter the Marks for Maths: ");
			int mathMarks = sc.nextInt();
			System.out.println("Enter the Marks for Biology: ");
			int bioMarks = sc.nextInt();
			
			ScienceStudent science = new ScienceStudent(physicsMarks, chemMarks, mathMarks, bioMarks);
			return science.findPercentage();
		}
		else if(choice ==3) {
			System.out.println("Enter the Marks for Account: ");
			int account = sc.nextInt();
			System.out.println("Enter the Marks for Economics: ");
			int economic = sc.nextInt();
			System.out.println("Enter the Marks for Business Studies: ");
			int business = sc.nextInt();
			
			CommerceStudent commerce = new CommerceStudent(account, economic, business);
			return commerce.findPercentage();
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Which Student percentage do you want ot find: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. ArtStudent");
		System.out.println("2. ScienceStudent");
		System.out.println("3. CommerceStudent");
	    
		int choice = sc.nextInt();
		double percentage = getStudent(choice);
		
		if(percentage > 0) {
			System.out.println("Percentage is: "+percentage);
		}
		else {
			System.out.println("Invalid choice. Percentage not found. ");
		}
	}

}
