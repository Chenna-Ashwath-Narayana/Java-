package Digit_Practice;

import java.util.Scanner;

public class MultiplicationTableWithAll_DigitsinNumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = scan.nextInt();
	while (num != 0) {
		int digit = num % 10;
		for (int i = 0; i <= 10; i++) {
			int mul = digit * i;
			System.out.println(digit + " * " + i + " = " + mul);
		}
		System.out.println();
		num /= 10;
	} 
}
}
