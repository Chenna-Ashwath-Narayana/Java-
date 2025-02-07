package Digit_Practice;

import java.util.Scanner;

public class Sumofdigits_GivenNumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = scan.nextInt();
	int rev = 0 , sum = 0, count = 0;
	while (num != 0) {
		rev = num % 10;
		sum = sum + rev;
		num = num / 10;
		count ++ ;
	}
	System.out.println(sum);
	System.out.println(count);
	double average = sum / count;
	System.out.println(average);
	
	//program to check last digit is even or odd
	System.out.println("Enter the Number");
	int n=scan.nextInt();
	int last = n % 10;
	if (last % 2 == 0) {
		System.out.println("Even number " + last);
	}else {
		System.out.println("Odd number " + last);
	}
}
}
