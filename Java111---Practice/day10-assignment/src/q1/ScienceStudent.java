package q1;

public class ScienceStudent extends Student{
	

	Double physicsMarks;
	Double chemistryMarks;
	Double mathMarks;
	
	public ScienceStudent(String name, String address,Double physicsMarks, Double chemistryMarks, Double mathMarks) {
		super(name, address);
		// TODO Auto-generated constructor stub
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
	}

	@Override
	double getPercentage() {
		// TODO Auto-generated method stub
		Double maxMarks = 100.0;
		Double totalMarks = physicsMarks + chemistryMarks + mathMarks;
		
		return (maxMarks/(3*maxMarks)*100);
	}

}
