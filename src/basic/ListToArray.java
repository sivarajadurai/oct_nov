package basic;

import java.util.ArrayList;

public class ListToArray {

	public static void main(String[] args) {
ArrayList<Integer> a = new ArrayList<Integer>();
a.add(10);
a.add(30);
a.add(40);
a.add(50);


int k[] = new int[a.size()];
for(int i=0;i<k.length;i++) {
	k[i]=a.get(i);
}

for(int i:k) {
	System.out.println(i);
}

	}

}
