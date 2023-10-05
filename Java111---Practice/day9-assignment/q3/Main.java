package q3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee("nafisa", 25, "123", "Nagpur", 20.50, "Enginner","IT");
		Manager m = new Manager("Partha", 21, "Kolkata", "Kolkata", 40.00, "Managemnt","Sales");
		
		System.out.println("Print the Details of Members");
		System.out.println("Name is: "+e.name);
		System.out.println("Age is: "+e.age);
		System.out.println("Phone number :"+e.phoneNumber);
		System.out.println("Salary is: "+ e.salary);
		System.out.println("Specialization: "+e.specialization);
		System.out.println("Department: "+e.department);
		e.printSalary();

	}

}
