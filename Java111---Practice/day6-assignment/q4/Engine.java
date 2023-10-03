package q4;

public class Engine {
	
	 Integer rmp;
	 Integer Power;
	 String manufacturer;
	 boolean hasTurbo;
	
	public Engine() {
		// TODO Auto-generated constructor stub
	}
	
	public Engine(Integer rmp, Integer power, String manufacturer, boolean hasTurbo) {
		super();
		this.rmp = rmp;
		Power = power;
		this.manufacturer = manufacturer;
		this.hasTurbo = false;
	}

	void Turbo() {
		this.hasTurbo = true;
	}

	
	

}
