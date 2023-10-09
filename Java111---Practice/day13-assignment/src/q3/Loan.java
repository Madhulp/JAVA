package q3;

public class Loan {
	
	public double calculateLoanAmount(Employee employeeObj) {
		if(employeeObj.getEmployeeName().equals("PermanentEmployee")) {
			return 0.15*employeeObj.getSalary();
		}
		else if(employeeObj.getEmployeeName().equals("TemporaryEmployee")) {
			return 0.10 * employeeObj.getSalary();
		}
		else {
			return 0;
		}
		
		
	}

	public static void main(String[] args) {
		
		Loan l1 = new Loan();
		double permanenetEmployeeLoan = l1.calculateLoanAmount(new PermanentEmployee(1, "PermanentEmployee", 1000.0));
	
	    double temporaryEmployeeLoan = l1.calculateLoanAmount(new TemporaryEmployee(2, 20, 100, "TemporaryEmployee"));
	
	    
	    System.out.println("Loan AMount for Permanenet Employee => "+permanenetEmployeeLoan);
	    System.out.println("Loan Amount for Temporary Employee => "+temporaryEmployeeLoan);
	}
}
