package question1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//By using empty constructor
		Student s1 = new Student();
		s1.setRoll(1);
		s1.setName("Nafisa");
		s1.setMarks(500);
		s1.setAge(25);
		System.out.println(s1);
		
		
		//By Using parameterized constructor
		Student s2 = new Student(2, "Pinku", 600, 19);
		System.out.println(s2);
	}

}
