package stringspractice;

import java.util.Scanner;

public class Printa2b3c5 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the String in the format (aaabbbddcc)");
	String name = scan.next();
	String sc = "";
	int count = 1;
	for (int i = 1; i < name.length(); i++) {
		if (name.charAt(i) == name.charAt(i-1)) {
			count ++ ;
		}else {
			sc = sc + name.charAt(i-1);
			sc = sc + count;
			count = 1;
		}
	}
	sc= sc + name.charAt(name.length() - 1);
	sc = sc + count;
	System.out.println(sc);
}
}
