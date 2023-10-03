package q2;

public class Member {
	
	 String name;
	 Integer age;
	 String phoneNumber;
	 String address;
	 Double salary;

	public Member(String name, Integer age, String phoneNumber, String address, Double salary) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}
	
	void printSalary() {
		System.out.println("Salary: "+salary);
	}


	
}
