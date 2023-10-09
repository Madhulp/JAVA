package q3;

public class Main {
	
	static void messageToStudents(Evaluation evaluation) {
		if(evaluation instanceof CodingEvaluation) {
			System.out.println("Its a Coding Evalaution");
		}
		else if(evaluation instanceof DsaEvaluation) {
			System.out.println("Its a DSA evaluation");
		}
		evaluation.printNoOfQuestions();
		evaluation.evaluationtiming();
		System.out.println("=========================");
	}
	
	
	public static void main(String[] args) {
		messageToStudents(new DsaEvaluation(5));
		messageToStudents(new CodingEvaluation(4));
	}

}
