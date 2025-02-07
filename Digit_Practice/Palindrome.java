package Digit_Practice;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = scan.nextInt();
	int original = num;
	int reverse = 0;
	while (num != 0) {
		int digit = num % 10;
		reverse = reverse * 10 + digit;
		num /= 10;
	}
	if (original == reverse) {
		System.out.println(original + " The given number is palindrome " + reverse);
	}else {
		System.out.println(original + " The given number is not palindrome " + reverse);
	}
	
}
}
