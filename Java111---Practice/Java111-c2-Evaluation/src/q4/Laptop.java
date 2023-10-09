package q4;

public class Laptop {

	private String color;
	private String companyName;
	private String name;
	private String purpose;
	private CPU cpu;
	private GraphicCard graphicCard;
	
	void displayDetails() {
		System.out.println("Laptop Details");
		System.out.println("=======================");
		System.out.println("Laptop Name => "+name);
		System.out.println("company Name => "+companyName);
		System.out.println("Laptop color => "+color);
		System.out.println("Laptop Purpose => "+purpose);
		System.out.println("CPU's Manufacturer => "+cpu.getManufacturer());
		System.out.println("CPU's processor => "+cpu.getProdessor());
		System.out.println("CPU's ClockSpeed => "+cpu.getClockSpeed());
		System.out.println("Graphic Card Manufacturer => "+graphicCard.getManifacturer());
		System.out.println("Graphic Card Series => "+graphicCard.getSeries());
		System.out.println("Graaphic Card capacity => "+graphicCard.getCapacity());
		
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(String color, String companyName, String name, String purpose, CPU cpu, GraphicCard graphicCard) {
		super();
		this.color = color;
		this.companyName = companyName;
		this.name = name;
		this.purpose = purpose;
		this.cpu = cpu;
		this.graphicCard = graphicCard;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public GraphicCard getGraphicCard() {
		return graphicCard;
	}

	public void setGraphicCard(GraphicCard graphicCard) {
		this.graphicCard = graphicCard;
	}
	
	
}
