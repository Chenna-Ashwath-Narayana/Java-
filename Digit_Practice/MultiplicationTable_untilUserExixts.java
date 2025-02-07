package Digit_Practice;

import java.util.Iterator;
import java.util.Scanner;

public class MultiplicationTable_untilUserExixts {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Number for Multiplication table");
	int num = scan. nextInt();
	System.out.println("Enter the Number the user wants");
	int userwants = scan.nextInt();
	for (int i = 0; i <= userwants; i++) {
		int mul = num * i;
		System.out.println(num + " * " + i + " = " + mul);
	}
}
}
