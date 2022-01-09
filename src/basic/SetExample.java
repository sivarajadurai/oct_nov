package basic;

import java.util.HashSet;

public class SetExample {
	public static void main(String agr[]) {
		
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(40);
		hs.add(30);
		hs.add(10);
		hs.add(null);
		
//		int a[]= {10,20,30};
//		for(int k :a) {
//			hs.remove(k);
//		}
//		
		
//		hs.remove(10);
		System.out.println(hs);
			
	}

}
