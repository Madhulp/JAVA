package q1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.setRoll(1);
		s1.setName("Nafisa");
		s1.setAge(25);
		s1.setMarks(300);
		
		System.out.println(s1);
		
		Student s2 = new Student(2, "Par", 21, 200);
		System.out.println(s2);

	}

}
