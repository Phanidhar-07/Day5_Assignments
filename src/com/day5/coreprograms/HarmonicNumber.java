package com.day5.coreprograms;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {

		double n;
		double temp=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter N: ");
		n=sc.nextInt();	
		
		if(n>0)
		{
			for(double i=1; i<=n; i++)
			{
				temp=temp+(1/i);
			}
			System.out.println("The Harmonic value of "+n+"th term is: "+temp);
		}
		else
		{
			System.out.println("Wrong Input");
		}
	}
}
