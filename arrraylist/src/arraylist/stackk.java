package arraylist;
import java.util.Stack;
public class stackk {
public static void main(String[] args) {
	Stack st=new Stack();
	st.push(10);
	st.push(20);
	st.push(30);
	st.push(40);
	st.push(50);
	System.out.println(st);
	System.out.println(st.peek());

	st.pop();
	System.out.println(st);
	System.out.println(st.empty());
	System.out.println(st.firstElement());
	System.out.println(st.capacity());
	System.out.println(st.peek());
	System.out.println(st.contains(st));
	System.out.println(st.search(st));
	System.out.println(st);
}
}