package com.day5.coreprograms;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the First Number");
		int num1 = scan.nextInt();

		System.out.println("Enter the Second number");
		int num2 = scan.nextInt();

		System.out.println("Before swapping: " + num1 + " " + num2);

		int temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("After swapping: " + num1 + " " + num2);

	}

}
