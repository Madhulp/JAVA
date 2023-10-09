package q3;

public abstract class Evaluation {
	
	private final int numberOfQuestions;
	
	public Evaluation(int numberOfQuestions) {
		super();
		this.numberOfQuestions = numberOfQuestions;
	}

	abstract void evaluationtiming();
	
	void printNoOfQuestions() {
		System.out.println("No. of questions in Evaluation is:"+numberOfQuestions);
	}

}
