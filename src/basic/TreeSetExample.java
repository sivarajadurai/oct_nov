package basic;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TreeSet ts= new TreeSet();
		ts.add('d');
		ts.add('e');
		ts.add('a');
		ts.add('b');
		try {
		ts.add(null);
		}catch(Exception e) {
			
		}
		
		
		//unindex value
		for(Object k:ts) {
			System.out.println(k);
		}
		
	}

}
