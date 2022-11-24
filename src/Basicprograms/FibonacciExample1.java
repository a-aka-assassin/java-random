package Basicprograms;

public class FibonacciExample1 {

	public static void main(String[] args) {
		// Fibonacci Series without using recursion
		int n1 = 0;
		int n2 = 1;
		int count = 20;
		int n3;
		
		for(int i = 2; i < count; i++) {
			n3 = n1 + n2;
			System.out.print(n3 + ",");
			n1 = n2;
			n2 = n3; 
		}

	}

}
