package week2Pracc; //this is the package 
import java.util.Scanner; // import scanner class for user input 

public class StockCommison {  // starting point of my program 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // scanner object for reading input 
		
		System.out.println("Enter the number of shares purchased");  // asking the user input 
		int numberOfShares = scanner.nextInt();
		
		System.out.println("Enter the price per share"); // same as before for asking the input from the user 
		double pricePerShare = scanner.nextDouble();
		
		double stockCost = numberOfShares * pricePerShare;  // Calculate total stock cost without commission
		double commission = stockCost * 0.0425;// Calculate broker commission (4.25% of stock cost)
		double totalCost = stockCost + commission;  // Calculate total cost including commission
		
		System.out.println("Stock cost (without commission): $" + stockCost);  // Calculate total stock cost without commission
		System.out.println("Commission: $" + commission); 
		System.out.println("Total cost (with commission): $" + totalCost);   // Calculate total cost including commission

		scanner.close();

		
		
		
		
		
		
		

	}

}
