package queueclass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sett {
public static void main(String[] args) {
	Set<Integer> mark=new HashSet<Integer>();
	mark.add(45);
	mark.add(52);
	mark.add(25);
	mark.add(36);
	System.out.println(mark);
	Iterator<Integer> i=mark.iterator();
	while (i.hasNext())
	{
            System.out.println(i.next());		
	}
	mark.remove(52);
	System.out.println(mark);
	mark.removeAll(mark);
	System.out.println(mark);
	System.out.println(mark.isEmpty());
}
}
