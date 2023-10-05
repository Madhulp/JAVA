package q4;

import java.util.Scanner;

public class Student {

	private Integer roll;
	private String name;
	private Integer marks;
	private Character grade;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Integer getRoll() {
		return roll;
	}



	public void setRoll(Integer roll) {
		this.roll = roll;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Integer getMarks() {
		return marks;
	}



	public void setMarks(Integer marks) {
		this.marks = marks;
	}



	public Character getGrade() {
		return grade;
	}



	public void setGrade(Character grade) {
		this.grade = grade;
	}



	public void displayDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter roll: ");
		roll = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Students Name: ");
		 name = sc.nextLine();
		System.out.println("Enter Student Marks: ");
		 marks = sc.nextInt();
		sc.close();
		
		grade = calculateGrade();
		
		System.out.println("STUDENTS DETAILS: ");
		System.out.println("roll is: "+roll);
		System.out.println("Name is: "+name);
		System.out.println("Marks is: "+marks);
		System.out.println("Grade is: "+grade);
	}
	
	private char calculateGrade() {
		if(marks >= 500) {
			return 'A';
		}
		else if(marks >= 400) {
			return 'B';
		}
		else  {
			return 'C';
		}
		
		
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}
	
	
}
