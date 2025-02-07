package Digit_Practice;

import java.util.Scanner;

public class PrimeNumbers {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = scan.nextInt();
	boolean isPrime = true;
	if (num <= 1) {
		isPrime = false;
	} else {
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
	}
	if (isPrime) {
		System.out.println(num + " num is a prime number.");
	} else {
		System.out.println(num + " num is not a prime number.");
	}
}
}
