/*(Find the Smallest Value) Write an application that finds the smallest of several integers.
Assume that the first value read specifies the number of values to input from the user.*/
package Chapter05;

import java.util.Scanner;

public class Exercise0511 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		System.out.print("Enter number of values: ");
		int count = input.nextInt();
		int num = count;
		if (count > 0 ) {
		System.out.print("Enter value: ");
			int small = input.nextInt();
			for(int i = 2; i <= count; --count)	{
				System.out.print("Enter value: ");
				int second = input.nextInt();
					if (second < small) {
						small = second;
					}//if	
			}//for	
		System.out.printf("Smallest value after input of %d numbers is: %d", num, small);
		input.close();	
		}//if
			else System.out.println("number of values must be more then zero");
	}//main
}//class
