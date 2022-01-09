package basic;

import java.util.Stack;
import java.util.Vector;

public class VectorExample {
	public static void main(String a[]) {
		Vector v = new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add("siva");
		System.out.println(v.get(0));
		
		for(Object o:v) {
			System.out.println(o);
		}
		
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.pop();
		System.out.println(s);
		
	}

}
