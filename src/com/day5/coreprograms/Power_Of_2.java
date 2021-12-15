package com.day5.coreprograms;

import java.util.Scanner;

public class Power_Of_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Power: ");
		int n = sc.nextInt();

		if ((n >= 0) && (n < 31)) 
		{
			for (int i = 1; i <= n; i++) 
			{
				int temp = (int) Math.pow(2, i);
				System.out.println(+temp);
			}
		} 
		else {
			System.out.println("Wrong Input");
		}

	}

}
