package com.bridgelabz.basics;
import java.util.Scanner;
public class Harmonic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i = 0;
		double count = 1;
		System.out.println("Enter the Number.");
		int num = sc.nextInt();
		sc.close();
		while(count<=num)
		{
			i = i + 1/count;
			count++;
		}
		System.out.println(i);
	}
}
