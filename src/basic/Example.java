package basic;

public class Example {

	public static void main(String[] args) {
	String s = "java";
	int l = s.length();
	System.out.println(l);
	
	char c[] = new char[4];
	c[0]='j';
	c[1]='a';
	c[2]='v';
	c[3]='a';
	
	char a[] = s.toCharArray();
	
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	
	

	}

}
