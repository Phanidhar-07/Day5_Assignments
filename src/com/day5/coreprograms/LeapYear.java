package com.day5.coreprograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year = sc.nextInt();

		if (String.valueOf(year).length() == 4) 
		{
			if ((year % 4) == 0) {
				System.out.println("Leap Year");
			} 
			else {
				System.out.println("Not a Leap Year");
			}
		} 
		else {
			System.out.println("Wrong Input");
		}
	}
}
