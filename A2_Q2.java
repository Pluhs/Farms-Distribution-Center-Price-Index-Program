// -------------------------------------------------------
// Assignment 2
// For COMP 248 Section 2222-R – Fall 2022
// --------------------------------------------------------
// Importing the scanner so that the user can input using his keyboard after opening the scanner
import java.util.Scanner;
public class A2_Q2 {

	public static void main(String[] args) {
		// ********************************************************************
		// This program allows the user to input a month and a market from  
		// the collected fruit, vegetable and diary of my farms' distribution 
		// center, resulting in the processed value of the price Index for that
		// month and market.
		// ********************************************************************
		System.out.println("Welcome to Farms Distribution Center Price Index Program:");
		System.out.println("=========================================================");
		System.out.print("\nPlease enter a Month and Market, respectively: ");
		Scanner keyIn = new Scanner(System.in);
		String month = keyIn.next();
		String market = keyIn.next();
		//declaring the variable
		double p = 0;
		//switch statement for the different combinations of months and market
		//used the lowercase method so whatever the user inputs is case-insensitive
		//could've used nested switch statements for each of the market cases 
		//but this way looks cleaner and easier to read.
		switch (month.toLowerCase() + market.toLowerCase())
		{
			case "january" +"domestic": 
				p = 75.25;
				break;
			case "january" +"international": 
				p = 24.75;
				break;
			case "february" + "domestic": 
				p = 62.86;
				break;
			case "february" + "international": 
				p = 37.14;
				break;
			case "march" + "domestic": 
				p = 54.78;
				break;
			case "march" +"international": 
				p = 45.22;
				break;
			case "april" + "domestic": 
				p = 68.46;
				break;	
			case "april" + "international": 
				p = 31.54;
				break;	
			case "may" + "domestic": 
				p = 35.89;
				break;
			case "may" + "international": 
				p = 64.11;
				break;
			case "june" + "domestic": 
				p = 28.94;
				break;
			case "june" + "international": 
				p = 71.06;
				break;
			case "july" + "domestic": 
				p = 42.50;
				break;
			case "july" + "international": 
				p = 57.5;
				break;
			case "august" + "domestic": 
				p = 86.10;
				break;
			case "august" + "international": 
				p = 13.9;
				break;
			case "september" + "domestic": 
				p = 69.7;
				break;
			case "september" + "international": 
				p = 30.3;
				break;
			case "october" + "domestic": 
				p = 85.4;
				break;
			case "october" + "international": 
				p = 14.6;
				break;
			case "november" + "domestic": 
				p = 75.9;
				break;
			case "november" + "international": 
				p = 24.1;
				break;
			case "december" + "domestic": 
				p = 76.8;
				break;
			case "december" + "international": 
				p = 76.8;
				break;
			// If none of the cases were true, default if-else statement will take place
			//for it to look cleaner, I used the market as the condition (2 options)è
			// if user inputs a market that is neither equal to domestic nor international
			//then the month would be not equal to any of the months in the cases
			default:if ((market.equals("domestic")|| (market.equals("international")))== false)
						System.out.println("Error: an invalid value has been entered for the 'Market' variable. Please retry again!");
					else
						System.out.println("Error: an invalid value has been entered for the 'Month' variable. Please retry again!");
		}
		//declaring variable and constant, so we can process the P values depending on the user inputs.
		final double W = 1.4672;
		double I = (double) 1/20 * (p * W);
		//used the printf method to only be left with 2 decimals for the variable I
		System.out.printf("\nThe value of the Price Index, 'I', is: " + "%-15.2f",I);
		System.out.println("\nThank you for using Farms Distribution Center Price Index Program!");
		keyIn.close();
	}
}
