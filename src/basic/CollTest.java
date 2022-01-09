package basic;

import java.util.ArrayList;

public class CollTest {

	public static void main(String[] args) {
		int k[]=new int[5];//fix 
		k[0]=10;//value insert in array
		k[1]=20;
		
		for(int l:k) {
			System.out.println(l);
		}
		
		
		ArrayList a = new ArrayList();
		a.add(10);//0
		a.add(30);//1
		a.add("siva");//2
		a.add(1,50);
		
		System.out.println(a.get(2));
		
		for(Object o:a) {
			System.out.println("foreach " +o);
		}
		
//		for(int i=0;i<a.size();i++) {
//			System.out.println(a.get(i));
//		}
		
		//10 50 20 siva 
	

	}

}
