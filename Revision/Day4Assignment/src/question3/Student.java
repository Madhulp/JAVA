package question3;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.roll = 1;
		s.name = "Nafisa";
		s.marks = 500;
		s.displayStudentDetails();

		Student s2 = new Student();
		s2.roll = 2;
		s2.name = "Pinku";
		s2.marks = 600;
		s2.displayStudentDetails();
	
		System.gc();

	}
	 int roll;
	 String name;
	 int marks;
	 
	void displayStudentDetails() {
		 System.out.println("Roll is : "+roll);
		 System.out.println("Name is : "+name);
		 System.out.println("Marks is : "+ marks);
		 System.out.println("=============================");
	 }



}
