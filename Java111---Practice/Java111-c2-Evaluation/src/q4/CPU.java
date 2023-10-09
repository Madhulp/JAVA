package q4;

public class CPU {
	
	private String manufacturer;
	private String prodessor;
	private double clockSpeed;
	
	public CPU() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CPU(String manufacturer, String prodessor, double clockSpeed) {
		super();
		this.manufacturer = manufacturer;
		this.prodessor = prodessor;
		this.clockSpeed = clockSpeed;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProdessor() {
		return prodessor;
	}

	public void setProdessor(String prodessor) {
		this.prodessor = prodessor;
	}

	public double getClockSpeed() {
		return clockSpeed;
	}

	public void setClockSpeed(double clockSpeed) {
		this.clockSpeed = clockSpeed;
	}
	
	

}
