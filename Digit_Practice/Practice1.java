package Digit_Practice;

import java.util.Scanner;

public class Practice1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	int num = scan.nextInt();
	int count = 0;
	int sum = 0;
	for (int i = 1; i <= num; i++) {
		if (num % i == 0) {
			count ++;
			sum += i;
			System.out.print(i + " ");
		}
	}
	System.out.println();
	System.out.println(count);
	System.out.println(sum);
}
}
