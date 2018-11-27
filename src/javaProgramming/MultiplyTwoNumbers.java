package javaProgramming;

import java.util.Scanner;

public class MultiplyTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter number2 : ");
		int num2 = sc.nextInt();
		
		int mul = num1 * num2;
		
		System.out.println("Product of two numbers is : "+mul);
		
		System.out.println("Enter number1 : ");
		double num3 = sc.nextDouble();
		
		System.out.println("Enter number2 : ");
		double num4 = sc.nextDouble();
		
		double mul1 = num3 * num4;
		
		System.out.println("Product of two numbers is : "+mul1);
		
		sc.close();

	}

}
