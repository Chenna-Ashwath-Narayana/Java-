package Digit_Practice;

//import java.util.Iterator;
import java.util.Scanner;

public class PowerofDigit {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = scan.nextInt();
	System.out.println("Enter the Exponent value user need");
	int exponent = scan.nextInt();
	int result = 1;
	for (int i = 1; i <= exponent; i++) {
		result = result * num;
	}
	System.out.println(num + " based on Exponent value " +result);
}
}
