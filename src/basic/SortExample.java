package basic;

import java.util.ArrayList;
import java.util.Collections;

public class SortExample {

	public static void main(String[] args) {
		int a[]= {2,4,1,3};
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]<a[j]) {
					int t = a[i];
					a[i]=a[j];
					a[j]=t;
				}
				
			}
		}
		
		for(int k:a) {
			System.out.println(k);
		}
		
		//Try this in ArrayList
		
		ArrayList<Integer> aa= new ArrayList<Integer>();
		aa.add(2);
		aa.add(4);
		aa.add(1);
		aa.add(3);
		
		//write a logic
		
		for(int i=0;i<aa.size();i++) {
			for(int j=0;j<aa.size();j++) {
				if(aa.get(i)<aa.get(j)) {
					int t = aa.get(i);
					aa.set(i,aa.get(j));
					aa.set(j,t);
					//a[i]=a[j];
					//a[j]=t;
				}
				
			}
		}
		
		///Collections.sort(aa);
		
		
		System.out.println(aa);
		
		//[1,2,3,4]
		
		
		
		
		
		

	}

}
