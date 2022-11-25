package NumberPrograms;

import java.util.Scanner;

public class reverseNumber {

	public static void reverseNumber(int number) {
		
		if(number < 10) {
			System.out.println("This only one number so reverse would be: " +number);
		}else {
			int reverse = 0;
			while(number!=0) {
				int remainder = number%10;
				reverse = reverse * 10 + remainder;
				number = number / 10;
				
			}
			System.out.println("The reverse of the number is: " + reverse);
		}
	}
	public static void main(String[] args) {
		
		System.out.println("Please input the number to be reversed:");
		Scanner object = new Scanner(System.in);
		int inputNumber = object.nextInt();
		reverseNumber(inputNumber);

	}

}
