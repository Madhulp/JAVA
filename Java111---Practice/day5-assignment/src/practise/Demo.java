package practise;

public class Demo {
	
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.start();// Vehicle start...
		
//		Vehicle v2 = new BMW();
//		v2.start();//Vehicle start...
//		
//		Vehicle v3 = new BMW();
//		 BMW b = (BMW)v3;
//		 b.Netflix();
//		 
//		 ((BMW) v3).Netflix();
		
		BMW b = new BMW();
		b.funct1(new Vehicle());//Vehicle running...
		
	
	}

}

class Vehicle{
	
	String name;
	
	void run() {
		System.out.println("Vehicle running..");
	}
	
	void start() {
		System.out.println("Vehicle start...");
	}
}

class BMW{
	
	void funct1(Vehicle vehicle){
		
		vehicle.run();
		
	}
	
	void Netflix() {
		System.out.println("BMW netflix on...");
	}
	
//	void start() {
//		System.out.println("BMW start...");
//	}
	
}
class Tata extends Vehicle{
	
	void radio() {
		System.out.println("Tata Radio start..");
	}
	
}
