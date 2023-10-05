package q1;

public class AllStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScienceStudent s = new ScienceStudent("Nafisa", "Nagpur", 70.0, 65.0, 50.5);
	    System.out.println("Name: "+s.name);
	    System.out.println("Address: "+s.address);
	    System.out.println("Physics Marks: "+s.physicsMarks);
	    System.out.println("Chemistry Marks: "+s.chemistryMarks);
	    System.out.println("Maths Marks: "+s.mathMarks);
	    System.out.println("Percentage: "+ s.getPercentage());
	}

}
