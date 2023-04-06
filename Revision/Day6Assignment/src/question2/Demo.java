package question2;

public class Demo {
	
	//Default constructor
	public Demo() {
		//calls constructor2
		this("Nafisa");
		System.out.println("Default constructor");
		System.out.println("===========");
	}
	
	//constructor2
	public Demo(String s) {	
		
		//calls constructor3
		this(2);
		System.out.println(s);
		System.out.println("String Constructor2");
		System.out.println("===========");
	}
	
	//constructor3
	public Demo(int i) {
		//calls constructor4
		this(2f);
		System.out.println(i);
		System.out.println("Int constructor3");
		System.out.println("===========");
	}

	//construcotr4
	public Demo(float f) {
		System.out.println(f);
		System.out.println("Float constructor");
		System.out.println("===========");
	}
	
	public static void main(String[] args) {
		new Demo();
		
		
	}


}
