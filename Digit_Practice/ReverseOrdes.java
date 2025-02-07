package Digit_Practice;

import java.util.Scanner;

public class ReverseOrdes {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = scan.nextInt();
	int rev = 0,n;
	while (num != 0) {
		n = num % 10;
		rev = rev*10+n;
		num = num/10;
	}
	System.out.println(rev);
	
	//last digit to print
	 System.out.println("Enter the Number");
	int num1 = scan.nextInt();
	int remove = num1 / 10;
	System.out.println(remove);
	
	//program to display the last digit of given number
	System.out.println("Enter the Number ");
	int num2 = scan.nextInt();
	int display = num2 % 10;
	System.out.println(display);
	
}
}
