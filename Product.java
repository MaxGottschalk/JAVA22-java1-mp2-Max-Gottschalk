package webshop;

class Product {
	
	private String productName;
	private int price;
	private int stock;
	
	Product(String productName, int price, int stock){
		this.productName = productName;
		this.price = price;
		this.stock = stock;
	}
	
	int getInStock() {
		return stock;
	}
	
	int removeFromStock() {
		stock--;
		if(stock <= 0)
		{
			stock = 0;
		}
		return stock;
	}
	
	public String getProductName() {
		return productName;
	}


	public int getPrice() {
		return price;
	}

	
}
