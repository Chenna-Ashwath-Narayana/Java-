package queueclass;

import java.util.PriorityQueue;

public class Prique {
public static void main(String[] args) {
PriorityQueue<Integer> pi=new PriorityQueue<Integer>();
pi.add(52);
pi.add(20);
pi.offer(25);
pi.offer(60);
pi.add(3);
System.out.println(pi);
for (Integer pr : pi) {
	System.out.println(pr);
}
	

}
}
