package Digit_Practice;

import java.util.Scanner;

public class Second_Largest {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = scan.nextInt();
	int largestDigit = 0;
	int secondLargestDigit = 0;
	while (num != 0) {
		int digit = num % 10;
		if (digit >largestDigit) {
			secondLargestDigit = largestDigit;
			largestDigit = digit;
		} else if (digit > secondLargestDigit && digit != largestDigit) {
			secondLargestDigit =digit;
		}num /= 10;
	}
	
	if (secondLargestDigit != 0) {
		System.out.println("The second Largest number is: " + secondLargestDigit);
	} else {
		System.out.println("There is no secondlargest number ");
	}
}
}
