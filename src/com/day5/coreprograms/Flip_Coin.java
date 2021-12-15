package com.day5.coreprograms;

import java.util.Scanner;

public class Flip_Coin {

	public static void main(String[] args) {
		int heads = 0;
		int tails = 0;
		int coinCheck;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter number of times coin has to flip: ");
		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			coinCheck = (int) (Math.random() * 10) % 2;
			System.out.println("Coin Check is: " + coinCheck);

			if (coinCheck < 0.5) {
				System.out.println("Tails");
				tails = tails + 1;
			} 
			else {
				System.out.println("Heads");
				heads = heads + 1;
			}
		}
		
		int ph = ((heads * 100) / n);
		int pl = ((tails * 100) / n);
		System.out.println("Number of Heads: " + heads);
		System.out.println("Number of Tails: " + tails);
		System.out.println("The percentage of Heads is: " + ph);
		System.out.println("The percentage of tails is: " + pl);
	}

}
