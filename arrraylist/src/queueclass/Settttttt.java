package queueclass;

import java.util.HashSet;
import java.util.Set;

public class Settttttt {
public static void main(String[] args) {
	Set<Integer>mark=new HashSet<>();
	mark.add(10);
	mark.add(20);
	mark.add(30);
	mark.add(40);
	System.out.println(mark);

	Set<Integer>mark2=new HashSet<>();
	mark2.add(10);
	mark2.add(200);
	mark2.add(300);
	mark2.add(400);
	System.out.println(mark2);
	
	mark.retainAll(mark2);
	System.out.println(mark);

}
}
