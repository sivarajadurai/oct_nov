package nov;

public class Example4 {
	int a =2;
	//Recurssion -> Method call itself(alternate of loop)
	void count() {
		System.out.println(a);
		a=a+2;
		if(a<10) {
			count();
		}
	}
	
	int b=1,f=1;
	void fact() {	
		f=f*b;
		b++;
		if(b<=5)
		fact();
	}
	
	int factorial(int n) 
	{
		if(n == 1)
			return 1;
		//return n * (n-1) * (n-2) * (n-3);//4*3
		else
		return n * factorial(n-1);
	}
	
	
	//4*factorial(3)=>4*6 =24
	// 3*factorial(2) => 3*2 = 6
	//2*factorial(1) => 2*1=2
	// 1
	
	
	
	public static void main(String arg[]) {
		Example4 e4 = new Example4();
		e4.count();//1 2 3
		
		e4.fact();
		System.out.println(e4.f);
		
		System.out.println("factori with return type");
		int fact = e4.factorial(4);
		System.out.println(fact);
		
	}

}
