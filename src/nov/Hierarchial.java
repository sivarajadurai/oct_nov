package nov;
//Hybrid

class GP{
	void message() {
		
	}
}

class P{
	void print() {
		
	}
}

class C1 extends P{
	void show() {
		
	}
}

class C2 extends P{
	void display() {
		
	}
}

public class Hierarchial {
	public static void main(String[] args) {
		C1 c = new C1();
		c.print();
		c.show();
		//c.display();
		
		C2 d = new C2();
		d.display();
		d.print();
		
		P p = new P();
		p.print();
	//	p.show();
	//	p.display();
		
	}

}
