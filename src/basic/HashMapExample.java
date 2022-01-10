package basic;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		
		HashMap hm = new HashMap();
		hm.put("employee_id", 100);
		hm.put("employee_name", "siva");
		hm.put("salary", null);
		
		System.out.println(hm);
		
		Set s = hm.keySet();//Map to Set [name,company,designation,username]
		for(Object k:s) {
			System.out.println(k);
			System.out.println(hm.get(k));//a[i]
		}
	}

}
