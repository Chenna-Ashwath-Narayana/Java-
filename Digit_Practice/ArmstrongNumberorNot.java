package Digit_Practice;

import java.util.Scanner;

public class ArmstrongNumberorNot {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	//Program for only 3 digits
	System.out.println("Enter the Number");
	int  num = 153;
	int original = num;
	int result = 1,sum = 0;
	while (num != 0) {
		int digit = num % 10;
			result = digit * digit * digit;
		System.out.print(result + " ");
		sum = sum + result;
		num /=10;
	}		
	
	System.out.println("");
	System.out.println("" + sum + " ");
	if (original == sum) {
		System.out.println("The number is Armstrong");
	}else {
		System.out.println("The number is not Armstrong");
	}

}
}
