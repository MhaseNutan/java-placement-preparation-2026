package ConditionalStatement;

import java.util.Scanner;

public class GreaterNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("First number is greater");
		} else {
			System.out.println("Second number is greater or both are equal");
		}
		sc.close();
	}
}
