package Basicprograms;

public class FibonacciExample2 {
	static int n1 = 1, n2 = 1, n3 = 0;
	static void printFib(int count) {
		if(count >  0) {
			n3 = n1 + n2;
			System.out.print(","+n3);
			n1 = n2;
			n2 = n3;
			printFib(count-1);
		}
	}
	public static void main(String[] args) {
		// Fibonacci Series with using recursion
		int count = 10;
		System.out.print(n1);
		printFib(count);
	}

}
