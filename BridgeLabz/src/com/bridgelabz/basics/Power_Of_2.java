package com.bridgelabz.basics;

import java.util.Scanner;

public class Power_Of_2 {
	public static void main(String[] args) {
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int num = 1;
		while(i<=n)
		{
			num = num * 2;
			i++;
		}
		sc.close();
		System.out.println(n+"th Power of 2 : "+num);
	}
}
