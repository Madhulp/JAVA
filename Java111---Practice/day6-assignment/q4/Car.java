package q4;

public class Car {
	
	 String model;
	 String companyName;
	 String Color;
	 Engine engine;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String model, String companyName, String color, Engine engine) {
		super();
		this.model = model;
		this.companyName = companyName;
		Color = color;
		this.engine = engine;
	}
	
	void printDetails() {
		System.out.println("Car Model: "+model);
		System.out.println("Car company Name: "+ companyName);
		System.out.println("Car color: "+ Color);
		System.out.println("Car RPM: "+ engine.rmp);
		System.out.println("Car power: "+ engine.Power);
		System.out.println("Car Engine Manifacturer: "+ engine.manufacturer);
		System.out.println("Car Has Turbo: "+ engine.hasTurbo);
	}

}
