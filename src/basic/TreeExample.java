package basic;

import java.util.Set;
import java.util.TreeMap;

public class TreeExample {

	public static void main(String ar[]) {
		TreeMap<String,Integer> t = new TreeMap<String,Integer>();
		
		t.put("Naveen", 66);
		t.put("Poovarasan", 87);
		t.put("Princy", 77);
		t.put("Santhosh", 66);
		t.put("Deepak", 76);
		
		Set <String>s = t.keySet();//[]
		
		int max =0;String name="";
		for(String k :s) {
			int mark = t.get(k);//
			if(mark > max) {
				max =mark;
				name = k;
			}
			
		}
		
		
		System.out.println(name);
		System.out.println(t.get(name));
	
	}
}
