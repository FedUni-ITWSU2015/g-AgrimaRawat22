package week2Pracc;
import java.util.Scanner;

public class StockCommison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of shares purchased");
		int numberOfShares = scanner.nextInt();
		
		System.out.println("Enter the price per share");
		double pricePerShare = scanner.nextDouble();
		
		double stockCost = numberOfShares * pricePerShare;
		double commission = stockCost * 0.0425;
		double totalCost = stockCost + commission;
		
		System.out.println("Stock cost (without commission): $" + stockCost);
		System.out.println("Commission: $" + commission);
		System.out.println("Total cost (with commission): $" + totalCost);

		scanner.close();

		
		
		
		
		
		
		

	}

}
