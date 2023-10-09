package q4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String => ");
		String str = sc.nextLine();
		System.out.println("Enter a position => ");
		int position = sc.nextInt();
		
		while(position<0 || position >= str.length()) {
			System.out.println("Invalid position, Please Enter a valid position => ");
			position = sc.nextInt();
		}
		
		char c = str.charAt(position);
		System.out.println("Character at postion "+position+" => "+c);
		sc.close();
	}

}
