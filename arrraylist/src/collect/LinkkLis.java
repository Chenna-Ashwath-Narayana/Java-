package collect;
import java.util.Iterator;
import java.util.*;
public class LinkkLis {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> dta=new LinkedList<String>();
		System.out.println("enter the number");
		dta.add(sc.next());
		System.out.println("enter the name");
		dta.add(sc.next());
		System.out.println("enter the college name");
		dta.add(sc.next());
		System.out.println(dta);
		
		/*System.out.println("after adding to first position");
		dta.addFirst("cbit");
		System.out.println(dta);
		System.out.println("after adding the last position");
		dta.addLast("vbit");
		System.out.println(dta);*/
		for(String ss:dta) {
			System.out.println(ss);
		}
		System.out.println("the removed");
		Iterator it=dta.iterator();
		while (it.hasNext()) {
			//System.out.println(it.next());
			if(it.next().equals("ece")) {
				it.remove();
			}}
		System.out.println(dta);

		LinkedList<Integer> ref=new LinkedList<Integer>();
		System.out.println("enter the number");
		ref.add(sc.nextInt());
		System.out.println("enter the name");
		ref.add(sc.nextInt());
		System.out.println("enter the college name");
		ref.add(sc.nextInt());
		System.out.println(ref);
		
		for(Integer ref1:ref) {
			System.out.println(ref1);
		}
	}
}
