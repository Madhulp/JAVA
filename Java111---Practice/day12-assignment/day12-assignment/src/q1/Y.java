package q1;

public interface Y {

	abstract void  bark();
	
	default void meow() {
		System.out.println("Inside Y interface - meow");
	}
	
	static void bleet() {
		System.out.println("Inside Y interface - bleet");
	}
}
