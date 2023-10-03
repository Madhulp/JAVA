package q1;

import java.util.Scanner;

public class Main {
	
	
	public static String reversString(String input){
		
		char[] array = input.toCharArray();
		
		for(int i=0, j=array.length-1; i<j;  i++, j--) {
			char temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		return new String(array);
		
		//write the logic
		}
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String originalString = sc.next();
		
		String result = reversString(originalString);
		System.out.println("Original String is :"+ originalString);
		System.out.println("Reversed String is :"+ result);
		}


}
