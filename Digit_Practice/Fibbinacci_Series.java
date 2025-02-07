package Digit_Practice;

import java.util.Iterator;
import java.util.Scanner;

public class Fibbinacci_Series {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter  the Number");
	int num = scan.nextInt();
	int a = 0, b = 1;
	for (int i = 0; i <= num; i++) {
		System.out.print(a + " ");
		int temp = a;
		a = b;
		b = temp + a;
	}
}
}
