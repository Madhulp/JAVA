package q1;

public interface X {
	
	abstract void run();
	
	default void eat() {
		System.out.println("Inside X interface - eat method");
	}
	
	static void walk() {
		System.out.println("Inside X interface - walk method");
	}

}
