package nov;
import java.util.Scanner;
public class MiniProject {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("1. Factorial");
		System.out.println("2. Sum of Digit");
		System.out.println("3. Reverse");
		System.out.println("Enter you choice :");
		int choice = s.nextInt();
		fact();
		sumOfDigit();
		reverse();
	}
	static void fact() {
		System.out.println("Please write factorial program");
	}
	static void sumOfDigit() {
		System.out.println("Please write sum of digit program");	
	}
	
	static void reverse() {
		System.out.println("Please write reverse digit program");	
	}
}
