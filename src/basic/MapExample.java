package basic;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapExample {
	
	
	//a[0]====>  a["name"]="siva";

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put("name", "siva");
		ht.put("company","payilagam");
		ht.put("name", "muthu");//key value got reassigned
		ht.put("designation", "developer");
		ht.put("username", "siv");
		
		//System.out.println(ht.get("com"));
		Set s = ht.keySet();//Map to Set [name,company,designation,username]
		for(Object k:s) {
			System.out.println(k);
			System.out.println(ht.get(k));//a[i]
		}
		

	}

}
