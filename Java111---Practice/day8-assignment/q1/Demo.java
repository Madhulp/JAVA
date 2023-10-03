package q1;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		System.out.println("Enter elements of array: ");
		
		for(int i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}

		for(int j=arr.length-1; j<0; j--) {
			int x = arr[j];
		}

	}

}
