/*
(Bar Chart Printing Program) One interesting application of computers is to display
graphs and bar charts. Write an application that reads five numbers between 1 and 30. 
For each number that’s read, your program should display the same number of adjacent asterisks. 
For example, if your program reads the number 7, it should display *******. 
Display the bars of asterisks after you read all five numbers.
*/
package Chapter05;

import java.util.Scanner;

public class Exercise0516 {

	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);
	
		int num1 = 0, num2= 0, num3= 0, num4= 0, num5= 0;
		int i = 1;
		
			System.out.println("Enter five number between 1 and 30!");
		
			System.out.printf("Number %d: ", i++);
			num1 = input.nextInt();
			System.out.printf("Number %d: ", i++);
			num2 = input.nextInt();
			System.out.printf("Number %d: ", i++);
			num3 = input.nextInt();
			System.out.printf("Number %d: ", i++);
			num4 = input.nextInt();
			System.out.printf("Number %d: ", i);
			num5 = input.nextInt();
		input.close();
	System.out.println();
	display(num1);
	display(num2);
	display(num3);
	display(num4);
	display(num5);
	}//main
	
public static void display(int num) {
	if (num >= 1 && num <=30) { 
		for(int i=1; i<=num; i++) {
			System.out.print("*");
		}//for
		System.out.println();
	}//if
	else {
		System.out.println("number is not between 1 and 30");
	}//else
}//display

}//class Exercise0516
