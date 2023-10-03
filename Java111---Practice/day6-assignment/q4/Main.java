package q4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Engine e1 = new Engine(10000, 110, "tata", true);
		//Car c2 = new Car("harrier", "Tata", "black", e1);
		
		Car c2 = new Car("BMW", "Royal", "yellow", new Engine(20000, 210, "royal", false));
		
		c2.engine.Turbo();
		c2.printDetails();
	
	}

}
