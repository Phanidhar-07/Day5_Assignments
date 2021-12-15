package com.day5.coreprograms;

import java.util.Scanner;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 1st Number: ");
		int n1 = sc.nextInt();

		System.out.println("Enter the 2nd Number: ");
		int n2 = sc.nextInt();

		System.out.println("Enter the 3rd Number: ");
		int n3 = sc.nextInt();

		System.out.println("Number1: " + n1);
		System.out.println("Number2: " + n2);
		System.out.println("Number3: " + n3);

		if ((n1 > n2) && (n1 > n3)) {
			System.out.println(+n1 + " is Greater than " + n2 + " and " + n3);
		} 
		else if ((n2 > n1) && (n2 > n3)) {
			System.out.println(+n2 + " is Greater than " + n1 + " and " + n3);
		} 
		else {
			System.out.println(+n3 + " is Greater than " + n1 + " and " + n2);
		}
	}
}
