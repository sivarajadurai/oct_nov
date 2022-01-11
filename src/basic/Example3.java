package basic;

public class Example3 extends Thread{
	
	int count =0;
	
	public void run() {
		for(int i =0 ;i<5;i++) {
			
			count++;
		}
	}

	public static void main(String[] args) {
		
		Example3 e3 = new Example3();
		System.out.println("Before thread started :"+e3.count);
		e3.start();
		
		Example3 e4 = new Example3();
		System.out.println("Before thread started :"+e3.count);
		e4.start();
		
		
		
		System.out.println("After thread started :"+e3.count);


	}

}
