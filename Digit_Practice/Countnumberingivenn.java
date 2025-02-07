package Digit_Practice;

import java.util.Iterator;
import java.util.Scanner;

public class Countnumberingivenn {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Number you need to count digits");
	long num = scan.nextLong();
	int count = 0;
	while (num != 0) {
	num = num / 10;
	count ++;
	}
	System.out.println(count);
	
}
}
