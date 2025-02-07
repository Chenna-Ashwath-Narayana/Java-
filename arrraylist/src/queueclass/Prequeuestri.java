package queueclass;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Prequeuestri {
public static void main(String[] args) {
	PriorityQueue<String> pr=new PriorityQueue<String>();
	pr.add("ashu");
	pr.add("mani");
	pr.offer("chandra");
	pr.offer("ganesh");
	System.out.println(pr);
	for (String pi : pr) {
		System.out.println(pi);
	}
}
}
