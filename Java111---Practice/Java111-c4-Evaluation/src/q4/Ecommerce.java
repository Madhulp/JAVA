package q4;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
	
	List<Product> productList = new ArrayList<>();
	
	void addproductToList(Product product) {
		boolean productExists = false;
		
		for(Product i: productList) {
			if(i.getName().equals(product.getName()) && i.getCompany().equals(product.getCompany())) {
				i.setCount(i.getCount()+product.getCount());
				System.out.println("count updated: Product already exists");
				productExists =  true;
				break;
			}
		}
		if(!productExists) {
			productList.add(product);
			System.out.println("Product added succesfully");
		}
	}

	public List<Product> showAllProducts(){
		return productList;
	}
}
