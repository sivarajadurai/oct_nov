package basic;

import java.util.*;


public class Addition {
public static void main(String args[]) {
	LinkedList ll = new LinkedList();
	Scanner s = new Scanner(System.in);
	for(int i=0;i<3;i++) {
		int a = s.nextInt();
		ll.add(a);
	}
	System.out.println(ll);
	
	int sum = 0;
	
	
	//Sum of array
	for(Object o:ll) {///[10]->10
		sum = sum + (Integer)o;
	}
	System.out.println(sum);
	
}
}
