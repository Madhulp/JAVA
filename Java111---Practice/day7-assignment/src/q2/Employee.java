package q2;

public class Employee extends Member{
	
	 String specialization;
	 String department;
	
	
	public Employee(String name, Integer age, String phoneNumber, String address, Double salary, String specialization, String Department) {
		super(name, age, phoneNumber, address, salary);
		// TODO Auto-generated constructor stub
		this.specialization = specialization;
		this.department = department;
	}


	

}
