package javaProgramming;

import java.util.Scanner;

public class positiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num = sc.nextInt();
		
		if(num > 0){
			System.out.println("Entered number is positive");
		}else if(num < 0){
			System.out.println("Entered number is negative");
		}else{
			System.out.println("Entered number is neither positive nor negative");
		}
		sc.close();
	}

}
