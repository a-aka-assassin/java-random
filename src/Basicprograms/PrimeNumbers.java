package Basicprograms;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,m,flag = 0;
		System.out.println("Input the number to be checked: ");
		Scanner object = new Scanner(System.in);
		int checkNumber = object.nextInt();
		
		m = checkNumber / 2;
		if(checkNumber == 0 || checkNumber == 1) {
			System.out.println(checkNumber + " is not a prime Number.");
		}else {
			for(i = 2; i <= m; i++) {
				if(checkNumber%i==0) {
					System.out.println(checkNumber + " is not a prime Number.");
					flag = 1;
					break;
				}
			}
		}
		if(flag == 0) {
			System.out.println(checkNumber + " is a prime Number.");
		}
	}

}
