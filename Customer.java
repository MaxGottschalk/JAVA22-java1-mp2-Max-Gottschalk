package webshop; 

class Customer {
	private int inCart = 0;
	private double sumCost = 0;
	
	
	void addToCart(int productAmount, double inCartCost) {
		inCart += productAmount;
		sumCost +=inCartCost;
	}
	
	int getInCart() {
		return inCart;
	}
	
	double getSumCost() {
		return sumCost;
	}
	
}
