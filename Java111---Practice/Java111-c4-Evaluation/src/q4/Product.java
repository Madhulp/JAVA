package q4;

public class Product {
	
	String name;
	double price;
	String company;
	Integer count;
	
	
	public Product(String name, double price, String company, Integer count) {
		super();
		this.name = name;
		this.price = price;
		this.company = company;
		this.count = count;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public Integer getCount() {
		return count;
	}


	public void setCount(Integer count) {
		this.count = count;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", company=" + company + ", count=" + count + "]";
	}
	
	

}
