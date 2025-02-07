package arraylist;
import java.util.*;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList std=new ArrayList();
		std.add(sc.nextInt());
		std.add("ashwath");
		std.add("CBIT");
		System.out.println(std);
		ArrayList std2=new ArrayList();
		std2.addAll(std);
		System.out.println(std2);
		std2.clear();
		System.out.println("after using the clear method");
		System.out.println(std2);
		System.out.println("Contain Method");
		System.out.println(std.contains("ashwath"));
		System.out.println(std.size());
		std.set(1, "ashu");
		System.out.println(std);
		System.out.println(std.get(1));
		System.out.println(std.indexOf("CBIT"));
		
	}

}
