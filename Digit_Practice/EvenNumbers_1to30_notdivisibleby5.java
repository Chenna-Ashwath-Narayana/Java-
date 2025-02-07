package Digit_Practice;

import java.util.Scanner;

public class EvenNumbers_1to30_notdivisibleby5 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	for (int i = 1; i <= 30; i++) {
		if (i % 2 == 0 && i % 5 != 0) {
			System.out.println(i);
		}
	}
}
}
