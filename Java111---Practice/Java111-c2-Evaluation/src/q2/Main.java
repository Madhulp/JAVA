package q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Add Students: ");
		int numOfStudents = sc.nextInt();
		sc.nextLine();
		
		Student[] s = new Student[numOfStudents];
		
		for(int i=0; i<numOfStudents; i++) {
			System.out.println("=================");
			System.out.println("RollNumber: ");
			int roll = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Name: " );
			String name = sc.next();
			
			System.out.println("Enter maarks: ");
			int marks = sc.nextInt();
			
			sc.nextLine();
			
			s[i] = new Student(roll, name, marks);
			System.out.println("Student details "+(i+1));
			System.out.println("Student Roll: "+s[i].getRoll());
			System.out.println("Student Name: "+s[i].getName());
			System.out.println("Student Marks: "+s[i].getMarks());
			System.out.println("=============================");
		}

	}

}
