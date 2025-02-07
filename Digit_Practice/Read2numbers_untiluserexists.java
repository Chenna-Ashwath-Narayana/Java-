package Digit_Practice;

import java.util.Scanner;

public class Read2numbers_untiluserexists {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the First number");
	int num = scan.nextInt();
	System.out.println("Enter the Second number");
	int num1 = scan.nextInt();
	System.out.println("Enter the user needed"
			+ " number to add");
	int userneed = scan.nextInt();
	int sum = 0;
	while (userneed != 0) {
		for (int i = 1; i <= userneed; i++) {
			sum = num + num1;
			System.out.println(num + " + " + num1 + " = " + sum);
		}
		userneed = scan.nextInt();
	}
}
}
