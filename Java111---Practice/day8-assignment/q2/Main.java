package q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row :");
		int N = sc.nextInt();
		System.out.println("Enter column:");
		int M = sc.nextInt();
		
		int[][] arr = new int[N][M];
		
		System.out.println("Enter elemnts of 2D array: ");
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		//Initialize an array to store the sum of even elements
		int[] columnSum = new int[M];
		
		//calculate sum of even elements
		for(int x=0; x<M; x++) {
			for(int y=0; y<N; y++) {
				if(arr[x][y]%2==0) {
					columnSum[y] += arr[x][y];
				}
			}
		}
		
		System.out.println("Even Sum :");
		//print the sum of each column
		for(int n=0; n<M; n++) {
			System.out.println(columnSum[n]);
		}
		
	}

}
