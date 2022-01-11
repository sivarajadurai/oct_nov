package nov;
class A{
	int x=5;
	
}

public class B extends A{
	int x=7;
	void print() {
		System.out.println(super.x);
		System.out.println(x);
	}
	
	public static void main(String[] args) {
	
		B b = new B();
		b.print();
		
	}

}
