package Digit_Practice;

import java.util.Scanner;

public class SumofFirstandLast {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scan.nextInt();
		int lastdigit = num % 10;
		int  firstdigit = 0;
		while (num > 10) {
			num /= 10;
			firstdigit = num;
		}
		System.out.println(firstdigit);
		int sum = firstdigit + lastdigit;
		System.out.println(sum);
}

}
