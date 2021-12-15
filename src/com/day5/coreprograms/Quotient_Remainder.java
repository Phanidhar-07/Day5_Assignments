package com.day5.coreprograms;

import java.util.Scanner;

public class Quotient_Remainder {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to be Divided: ");
		int n=sc.nextInt();
		
		System.out.println("Enter the Number that Divides: ");
		int d=sc.nextInt();
		
		int r=n%d;
		int q=n/d;
		
		System.out.println("The Remainder is: "+r);
		System.out.println("The Quotient is: "+q);

	}
}
