package q3;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Students: ");
		int num = sc.nextInt();
		
		Student[] arr = new Student[num];
		for(int i=0; i<num; i++) {
			System.out.println("Enter details of student "+(i+1)+":");
			 System.out.println("Roll: ");
			int roll = sc.nextInt();
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Address: ");
			String address = sc.nextLine();
			System.out.println("Marks: ");
			int marks = sc.nextInt();
			
			arr[i] = new Student(roll, name, address, marks);
		}
		
		System.out.println("=================================================");
		//print all students Details
		System.out.println("STUDENTS DETAILS: ");
		for(Student i : arr) {
			System.out.println(i);
		}
		
		System.out.println("======================================================");
		//print average marks of all students
		int totalMarks=0;
		for(Student j : arr) {
			totalMarks += j.getMarks();
		}
		double averageMarks = (double)totalMarks / num;
		System.out.println("Average marks: "+averageMarks);
	}

}
