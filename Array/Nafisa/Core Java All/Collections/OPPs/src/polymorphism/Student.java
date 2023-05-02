package polymorphism;

public class Student {
	
	String name;
	int age;
	
	public void printInfo(String name) {
		System.out.println(this.name);
	}
	
	public void printInfo(int age) {
		System.out.println(this.age);
	}

	public void printInfo(String name, int age) {
		System.out.println(name + " " + age);
	}
}
