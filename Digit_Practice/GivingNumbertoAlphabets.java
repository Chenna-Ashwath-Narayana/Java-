package Digit_Practice;

import java.util.Scanner;

public class GivingNumbertoAlphabets {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num = scan . nextInt();
	String result = "";
	while (num > 0) {
		num--;
		int remainder = num % 26;
		result = (char)('A' + remainder)+result;
		num /= 26;
		
	}
	System.out.println(result);
	
}
}
