package nov;

public class Child extends Parent { //Siva s/o Rajadurai
	
	void sub() {
		System.out.println("I am child");
	}
	
	Child(){
		super(3);//manually call the parent's constructor
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {
		
		Child c = new Child();
		c.sub();//Child class method
		c.add();//Parent class method
		c.maths();//GrandParent class method
	}

}
