package nov;

public class Example2 {
	//no return type without parameter
	void add() {
		int a=9,b=3;
		int c=a+b;
		System.out.println(c);
	}
	
	//no return type with parameter/argument
	void sub(int a,int b) {
		int c = a-b;
		System.out.println(c);
	}
	
	//return type without paramter
	int mult() {
		int a=8,b=6;
		int c = a*b;
		return c;
	}
	
	//return type with parameter
	int div(int a, int b) {
		int c = a/b;
		return c;
	}
	
	public static void main(String[] args) {
		
		Example2 e2 = new Example2();
		e2.add();
		e2.sub(2, 3);
		int m= e2.mult();
		int d = e2.div(4,2);
		System.out.println(m);
		System.out.println(d);
		
	}

}
