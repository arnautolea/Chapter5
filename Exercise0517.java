/*(Calculating Sales) An online retailer sells five products whose retail prices are as follows:
Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
Write an application that reads a series of pairs of numbers as follows:
a) product number
b) quantity sold
Your program should use a switch statement to determine the retail price for each product. It
should calculate and display the total retail value of all products sold. Use a sentinel-controlled
loop to determine when the program should stop looping and display the final results.*/
package Chapter05;

import java.util.Scanner;

public class Exercise0517 {
	
	public static void main(String[] args) {
		
		int product = 0;
		int quantity = 0;
		double price = 0.0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter product number(or 0 to stop): ");
		product = input.nextInt();
			while(product !=0) {
				if (product > 0 && product <= 5 ) {
					System.out.print("Quantity sold: ");
					quantity = input.nextInt();
					if (quantity > 0) {
						switch (product) {
						case 1:
							price += 2.98 * quantity;
						break;
						case 2:
							price += 4.50 * quantity;
						break;
						case 3:
							price += 9.98 * quantity;
						break;
						case 4:
							price += 4.49 * quantity;
						break;
						case 5:
							price += 6.87 * quantity; 
						}//switch
					}//if
					else {
						System.out.println("quantity must be greater than 0");
						continue;
					}//else
				}//if
				else {
					System.out.println("invalid product number (must be 1 to 5 or 0 to stop)");
				}//else
			System.out.print("Enter product number(or 0 to stop): ");
			product = input.nextInt();
			}//while
		input.close();	
		System.out.println("Total retail value of all products sold: $"+ price);
	}//main
}//class
