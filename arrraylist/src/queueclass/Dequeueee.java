package queueclass;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.ListIterator;
public class Dequeueee {
public static void main(String[] args) {
	ArrayDeque<Integer> arr=new ArrayDeque<Integer>();
	arr.add(10);
	arr.offer(25);
	arr.offerFirst(69);
	arr.remove(10);
	arr.pop();
	arr.offerLast(63);
	arr.push(52);
	System.out.println(arr);
	Iterator it=arr.iterator();
	while (it.hasNext()) {
		System.out.println(it.next()); 	
	}
	/*ListIterator li=arr.listiterator();
	while (i.hasprevious()) {		
	}*/
	}
	}

