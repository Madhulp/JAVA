package q6;

public class ScienceStudent implements Student{
	
	private Integer physicsMarks;
	private Integer chemistryMarks;
	private Integer mathsMarks;
	private Integer biologyMarks;
	
	public ScienceStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ScienceStudent(Integer physicsMarks, Integer chemistryMarks, Integer mathsMarks, Integer biologyMarks) {
		super();
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
		this.biologyMarks = biologyMarks;
	}

	public Integer getPhysicsMarks() {
		return physicsMarks;
	}

	public void setPhysicsMarks(Integer physicsMarks) {
		this.physicsMarks = physicsMarks;
	}

	public Integer getChemistryMarks() {
		return chemistryMarks;
	}

	public void setChemistryMarks(Integer chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}

	public Integer getMathsMarks() {
		return mathsMarks;
	}

	public void setMathsMarks(Integer mathsMarks) {
		this.mathsMarks = mathsMarks;
	}

	public Integer getBiologyMarks() {
		return biologyMarks;
	}

	public void setBiologyMarks(Integer biologyMarks) {
		this.biologyMarks = biologyMarks;
	}

	@Override
	public String toString() {
		return "ScienceStudent [physicsMarks=" + physicsMarks + ", chemistryMarks=" + chemistryMarks + ", mathsMarks="
				+ mathsMarks + ", biologyMarks=" + biologyMarks + "]";
	}

	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		return (physicsMarks + chemistryMarks + mathsMarks + biologyMarks)/4.0;
	}
	
	

}
