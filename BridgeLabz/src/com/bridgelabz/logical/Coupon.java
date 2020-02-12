package com.bridgelabz.logical;
import java.util.Random;
import java.util.Scanner;
public class Coupon {
	private static boolean check(double ar[], double n)
	{
		for(int i = 0;i<ar.length;i++)
		{
			if(n==ar[i])
				return false;
		}
		return true;
	}
	public static int simulate(int n)
	{
		Random rd = new Random();
		int count = 0;
		int i = 0;
		double array[] = new double[n];
		while(i<n)
		{
			count++;
			int number = rd.nextInt(5);
			if(check(array, number))
			{
				array[i] = number;
				i++;
			}
			else
				continue;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Distinct Value you Want.");
		int n = sc.nextInt();
		int value = simulate(n);
		System.out.println("Total Number of Random Number Generated : "+value);
		sc.close();
	}
}
