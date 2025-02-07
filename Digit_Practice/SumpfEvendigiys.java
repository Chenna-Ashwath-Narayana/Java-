package Digit_Practice;

import java.util.Scanner;

public class SumpfEvendigiys {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Number");
	 int num = scan.nextInt();
	int digit = 0;
	while (num != 0) {
		digit = num % 10;
		if (digit % 2 == 0) {
			System.out.print(digit + " ");
		}
		num =  num / 10;
	}
	
	//print the sum of even digits in the given number
	System.out.println("Enter the Number");
	int num1 = scan.nextInt();
	int digit1 = 0,sum = 0;
	while (num1 > 0) {
		digit1 = num1 % 10;
		if (digit1 % 2 == 0) {
			sum = sum + digit1;
			System.out.print(digit1 + " ");
		}
		num1 =  num1 / 10;
	}
	System.out.println(" ");
	System.out.println("The Sum of the Even N: " + sum);
	
	///count the even digits in a number
	System.out.println("Enter the Number");
	int num2 = scan.nextInt();
	int digit3 = 0 , count = 0;
	while (num2 != 0) {
		digit3 = num2 % 10;
		if (digit3 % 2 == 0) {
			count++;
		}
		num2 = num2 / 10;
	}
	System.out.println(count);
	
}
}
