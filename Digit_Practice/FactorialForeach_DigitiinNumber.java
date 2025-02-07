package Digit_Practice;

import java.util.Scanner;

public class FactorialForeach_DigitiinNumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = scan.nextInt();
	while (num != 0) {
		int digit = num % 10;
		int factorial = 1;
		for (int i = 1; i <= digit; i++) {
			
				factorial = factorial * i;
				
			System.out.println("Factorial of " + digit + " is "+ factorial);
		}
		System.out.println();
		num /= 10;
	}
}
}
