package Digit_Practice;

import java.util.Scanner;

public class ArmstrongBasedOnDigitCount {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = scan.nextInt();
	int original = num;
	int count = 0, sum = 0;
	int result = 1;
	//To find the count of the given number
	while (num != 0) {
	  int digit = num % 10;
		count ++;
		num /= 10;
	}
	System.out.println(count);
//	System.out.println();

//	num = original;
	while (original != 0) {
		int digit1 = original % 10;
		result = 1;
		for (int i = 1; i <= count; i++) {
			result *= digit1;
		}
		sum = sum + result;
		original /= 10;
	}
	System.out.println(sum);
	
}
}
