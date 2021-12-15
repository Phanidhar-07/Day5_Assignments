package com.day5.coreprograms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		
		if((n%2)==0)
		{
			System.out.println("The Number "+n+" is Even");
		}
		else if(n==1)
		{
			System.out.println("The Number "+n+" is Neither Even nor Odd");
		}
		else
		{
			System.out.println("The Number "+n+" is Odd");
		}
	}
}
