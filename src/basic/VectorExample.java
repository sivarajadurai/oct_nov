package basic;

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
		
	}

}
