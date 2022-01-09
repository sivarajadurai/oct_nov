package nov;

public class Example3 {
	
	void m1() {
		m2();
		System.out.println(1);	
	}
	
	void m2() {
		m3();
		System.out.println(2);
	}
	
	void m3() {
		System.out.println(3);
	}

	public static void main(String[] args) {
		Example3 e3 = new Example3();
		e3.m1();//3  2 1                                              
	}

}
