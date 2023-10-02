package q2;

public class Demo {
	
	public Demo() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Default constructor");
	}
	
	public Demo(String s) {
		this();
		System.out.println("Inside String consatrcutor " + s);
	}

	public Demo(int i) {
		this("meMeow");
		System.out.println("Inside Int Constructor "+ i);
	}
	
	public Demo(float f) {
		this(2);
		System.out.println("Inside float constructor "+ f);
	}
	
	public static void main(String[] args) {
		Demo d = new Demo(3.14f);
		
	}
}
