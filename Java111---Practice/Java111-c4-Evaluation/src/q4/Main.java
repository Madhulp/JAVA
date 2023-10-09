package q4;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Ecommerce e = new Ecommerce();
		e.addproductToList(new Product("Shoes", 2000, "Adidas", 12));
		e.addproductToList(new Product("Ipad", 100000, "Apple", 2));
		
		List<Product> p = e.showAllProducts();
		
		for(Product i: p) {
			System.out.println(i);
		}
	}

}
