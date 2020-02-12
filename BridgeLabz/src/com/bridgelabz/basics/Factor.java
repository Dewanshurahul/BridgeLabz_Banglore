package com.bridgelabz.basics;

import java.util.Scanner;

public class Factor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to Find Prime Factor");
		int number = sc.nextInt();
		sc.close();
		int i = 2;
		while(number!=0)
		{
			if(number%i==0)
			{
				System.out.print(i+" ");
				number = number/i;
			}
			else
				i++;
		}
	}
}
