package co.chinmay;
import java.util.Scanner;
public class HelloWorld {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("enter any integer value");
		int a = kb.nextInt();	
		if ( a%2==0 ) {
			if (a%3==0) {
				System.out.println("number is divisible by 6 ");
				
			}
			else {
				System.out.println("number is only divisible by 2");
			}
		}
		else {
			if (a%3==0) {
				System.out.println("number is divisible by 3");
			}
			else {
				System.out.println("number is not divisible by both 3 and 2");
			}
		}
	}
}

		

