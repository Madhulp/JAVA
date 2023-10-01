package q3;

public class Main {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.roll = 1;
		s1.name = "Nafisa";
		s1.marks = 100;
		s1.displayStudentDetails();
		
		System.out.println("=============================");
		
		Student s2 = new Student();
		s2.roll = 2;
		s2.name = "Partha";
		s2.marks = 95;
		s2.displayStudentDetails();
		
		Student s3 = null;
		
		
		System.gc();
		

	}

}
