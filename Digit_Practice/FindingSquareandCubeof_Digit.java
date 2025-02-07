package Digit_Practice;

import java.util.Scanner;

public class FindingSquareandCubeof_Digit {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	while (num != 0) {
		int digit = num % 10;
		int square = digit * digit;
		int cube = digit * digit * digit;
		System.out.println(digit + " square is " +square);
		System.out.println(digit + " cube is " + cube);
		num /= 10;
	}
}
}
