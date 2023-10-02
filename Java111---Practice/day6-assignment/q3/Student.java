package q3;

public class Student {
	
	private Integer roll;
	private String name;
	private String address;
	private String collageName;
	
	public Student(Integer roll, String name, String address, String collageName) {
		super();
		this.roll = roll;
		this.name = name;
		this.address = address;
		this.collageName = collageName;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	
	public static Student getStudent(boolean isFromNIT, int roll, String name, String address) {
		
		if(isFromNIT) {
			return new Student(1, name, address, "NIT");
		}
		else 
			return new Student(2, name, address, "Local college");
	
	}
	
	public static void main(String[] args) {
		Student s1 = Student.getStudent(true, 1, "Nafisa", "Nagpur");
		Student s2 = Student.getStudent(false, 2, "Partha", "Kolkata");
		
		System.out.println("Student 1 Details:");
		System.out.println(s1.getRoll());
		System.out.println(s1.getName());
		System.out.println(s1.getAddress());
		System.out.println(s1.getCollageName());
		
		System.out.println("=================================");
		
		System.out.println("Student 2 Details:");
		System.out.println(s2.getRoll());
		System.out.println(s2.getName());
		System.out.println(s2.getAddress());
		System.out.println(s2.getCollageName());
		
	}

}
