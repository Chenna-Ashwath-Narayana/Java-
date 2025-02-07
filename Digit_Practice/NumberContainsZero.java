package Digit_Practice;

import java.util.Scanner;

public class NumberContainsZero {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = scan.nextInt();
	int digit = 0;
	while (num != 0) {
		digit = num % 10;
		if (digit == 0) {
			System.out.println("There is a number zero: " + digit);
		}else {
			System.out.println("There is no Zero in the number: " + digit);
		}
		num /= 10;
	}
	
	//program to find average in the given number
	System.out.println("Enter the Number");
	int num1 = scan.nextInt();
	int digit1 = 0 , sum = 0;
	while (num1 != 0) {
		digit1 = num1 % 10;
		sum += digit1;
		num1 /= 10;
	} 
	System.out.println(sum);
	
	//program to find first digit
	System.out.println("Enter the Number");
	int num2 = scan.nextInt();
	int digit2 = 0;
	while(num2 != 0) {
		digit2 = num2 % 10;
		num2 /= 10;
	}System.out.println(digit2);
}
}
