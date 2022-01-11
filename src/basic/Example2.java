package basic;

public class Example2 extends Thread {

	//To give task to new thread
	@Override
	public void run() {
		System.out.println("New Thread :"+currentThread());
	}

	public static void main(String[] args) {
	//Main Thread -Siva
		Example2 ruban = new Example2();//NEW
		ruban.setName("Ruban");
		ruban.setPriority(1);
		ruban.start();//New child thread -Runable
		for(int i=0;i<5;i++) {
		System.out.println("Main Thread : "+currentThread());
		}
	}

}
