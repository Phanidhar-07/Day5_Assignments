package com.day5.coreprograms;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Single Character: ");

		char c = sc.next().charAt(0);

		if (String.valueOf(c).length() > 1) 
		{
			System.out.println("Input is not a Single Character");
		} 
		else if ((c >= 48 && c <= 57)) {
			System.out.println("Input is not an Alphabet");
		} 
		else {
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				System.out.println("The Number " + c + " is Vowel");
			} 
			else {
				System.out.println("The Character " + c + " is Consonent");
			}
		}
	}
}
