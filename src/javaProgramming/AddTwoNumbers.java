package javaProgramming;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter number2 : ");
		int num2 = sc.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("Sum of two numbers is : "+sum);
		
		sc.close();

	}

}
