package Digit_Practice;

import java.util.Scanner;

public class Multiplicstion_Table {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = scan.nextInt();
	for (int i = 1; i <= 10; i++) {
		System.out.println(num + " * " + i + " = " + (num * i));
	}
}
}
