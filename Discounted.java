package webshop;

class Discounted extends Product {
	
	private double discount;
	
	Discounted(String productName, int price, int stock, double discount){
		super(productName, price, stock);
		this.discount = discount;
	}
	
	double discountedPrice() {
		double returnDisc = getPrice() -(getPrice() * discount);
		
		return returnDisc;
	}
	
}
