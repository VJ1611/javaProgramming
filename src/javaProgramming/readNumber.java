package javaProgramming;

import java.util.Scanner;

public class readNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		System.out.println("Entered number is : " +num);
		sc.close();
	}

}
