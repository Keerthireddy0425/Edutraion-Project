package EDUTRAION1;

import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Select the currency to convert from:");
        System.out.println("1. Rupee to Dollar");
        System.out.println("2. Dollar to Rupee");
        System.out.println("3. Euro to Rupee");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();

        switch (choice) {
            case 1:
                double dollar = amount * 0.013;
                System.out.println(amount + " Rupees = " + dollar + " Dollars");
                break;
            case 2:
                double rupeeFromDollar = amount * 79.37;
                System.out.println(amount + " Dollars = " + rupeeFromDollar + " Rupees");
                break;
            case 3:
                double rupeeFromEuro = amount * 80.85;
                System.out.println(amount + " Euros = " + rupeeFromEuro + " Rupees");
                break;
            default:
                System.out.println("Invalid choice");

	}

}
	}
