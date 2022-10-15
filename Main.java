package webshop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = 0;
		boolean inStore = true;
		Customer c = new Customer();
		Discounted dp = new Discounted("Pringels", 35, 10, 0.3);
		Product p = new Product("Coca Cola", 20, 5);
		Product p2 = new Product("Chicken", 100, 2);
		
		while(inStore)
		{
			System.out.println(" ____________________________");
			System.out.println("| In Cart: " + c.getInCart()+ " Total cost: " + c.getSumCost() + " |");
			System.out.println(" ----------------------------");
			
			System.out.println("1. Product: " + dp.getProductName() +" Price: " + dp.discountedPrice() + " In Stock: " + dp.getInStock());
			System.out.println("2. Product: " + p.getProductName() +" Price: " + p.getPrice() + " In Stock: " + p.getInStock());
			System.out.println("3. Product: " + p2.getProductName() +" Price: " + p2.getPrice() + " In Stock: " + p2.getInStock());
			System.out.println("4. Quit");
			System.out.print("Choose your option: "); 
			input = sc.nextInt();
			
			switch (input) {
				case 1: 
					if(dp.getInStock() > 0) {
						c.addToCart(1, dp.discountedPrice());
					}
					else {
						System.out.println(" __________________ ");
						System.out.println("!!! Out of stock !!!");
						System.out.println(" __________________ ");
					}
					dp.removeFromStock();
					break;
				case 2:
					if(p.getInStock() > 0) {
						c.addToCart(1, p.getPrice());
					}
					else {
						System.out.println(" __________________ ");
						System.out.println("!!! Out of stock !!!");
						System.out.println(" __________________ ");
					}
					p.removeFromStock();
					break;
				case 3:
					if(p2.getInStock() > 0) {
						c.addToCart(1, p2.getPrice());
					}
					else {
						System.out.println(" __________________ ");
						System.out.println("!!! Out of stock !!!");
						System.out.println(" __________________ ");
					}
					p2.removeFromStock();
					break;
				case 4: 
					inStore = false;
					System.out.println("  __________________________________________");
					System.out.println(" | Total cost: " + c.getSumCost() + "kr " + " Amount of groceries: " + c.getInCart() + "|");
					System.out.println("  ------------------------------------------");
					System.out.println(" _________________");
					System.out.println("| Have a nice day |");
					System.out.println(" -----------------");
			}
		}
		sc.close();
		
	}

}
