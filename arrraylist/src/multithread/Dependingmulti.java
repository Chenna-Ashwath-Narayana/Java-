package multithread;

import java.util.Scanner;

public class Dependingmulti {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("assingnment started");
	System.out.println("eneter the chapter to do the assingnment");
	int n=sc.nextInt();
	System.out.println("student completed assingnment "+n);
	//start of printing
	System.out.println("start printing");
	for(int i=0;i<n;i++) {
		System.out.println("cbit ece");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	System.out.println("printing ended");
	//addition operation
	System.out.println("addition");
	int a=10;
	int b=20;
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	int result=a+b;
	System.out.println("addition operation");
	System.out.println(result);
	System.out.println("addition completed");
	
}
}
