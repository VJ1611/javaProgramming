package javaProgramming;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base : ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter height : ");
		double num2 = sc.nextDouble();
		
		double area = (num1 * num2)/2;
		sc.close();
		
		System.out.println("Product of two numbers is : "+area);
	}	
}
