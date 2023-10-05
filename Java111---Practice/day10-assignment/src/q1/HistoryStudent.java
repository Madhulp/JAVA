package q1;

public class HistoryStudent extends Student{

	Double historyMarks;
	Double civicsMarks;
	
	public HistoryStudent(String name, String address, Double historyMarks, Double civicsMarks) {
		super(name, address);
		// TODO Auto-generated constructor stub
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	@Override
	double getPercentage() {
		// TODO Auto-generated method stub
		Double maxMarks = 100.0;
		Double totalMarks = historyMarks + civicsMarks;
		return (totalMarks/(2*maxMarks)*100);
	}
}
