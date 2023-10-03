package q2;

public class Main {

	public static void main(String[] args) {
		
		Employee e = new Employee("Nafisa", 25, "123", "Nagpur", 20.0, "Engineer", "IT");
		
		System.out.println("EMPLOYEE DETAILS: ");
		System.out.println("Employee Name: "+e.name);
		System.out.println("Employee age: "+e.age);
		System.out.println("Employee phone no: "+e.phoneNumber);
		System.out.println("Employee Address: "+e.address);
		System.out.println("Employee Salary: "+e.salary);
		System.out.println("Employee Specialization: "+e.specialization);
		System.out.println("Employee Department: "+e.department);
		e.printSalary();
		
	
		
	}

}
