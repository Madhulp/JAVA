package q1;

public class Student {
	
	private Integer roll;
	private String name;
	private Integer age;
	private Integer marks;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(Integer roll, String name, Integer age, Integer marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
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
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		if(age>=18 && age<60) {
			this.age = age;
		}
		else {
			throw new IllegalArgumentException("Age must be between 18 and 59");
		}
		
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		if(marks>0 && marks<500) {
			this.marks = marks;
		}
		else {
			throw new IllegalArgumentException("marks must be between 1 and 499");
		}
		
	}


	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}
	
	

}
