package week2Pracc;
import java.util.Scanner;

public class CalorieWatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		

		        Scanner scanner = new Scanner(System.in); // just to take input from the keyboard 
		        int cookiesEaten;

		        do {
		            System.out.println("Enter the number of cookies eaten (1 to 40): ");
		            cookiesEaten = scanner.nextInt();

		            if (cookiesEaten <= 0 || cookiesEaten > 40) {
		                System.out.println("Invalid input. Please try again.");
		            }

		        } while (cookiesEaten <= 0 || cookiesEaten > 40);

		        double servings = (cookiesEaten / 40.0) * 10;
		        double totalCalories = servings * 300;

		        System.out.println("You consumed " + totalCalories + " calories when you ate " + cookiesEaten + " cookies.");

		        scanner.close();
		    }
		

	}


