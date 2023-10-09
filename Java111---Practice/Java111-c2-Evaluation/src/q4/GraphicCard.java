package q4;

public class GraphicCard {
	
	private String manifacturer;
	private String capacity;
	private String series;
	
	public GraphicCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GraphicCard(String manifacturer, String capacity, String series) {
		super();
		this.manifacturer = manifacturer;
		this.capacity = capacity;
		this.series = series;
	}
	public String getManifacturer() {
		return manifacturer;
	}
	public void setManifacturer(String manifacturer) {
		this.manifacturer = manifacturer;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getSeries() {
		return series;
	}
	public void setSeries(String series) {
		this.series = series;
	}
	
	

}
