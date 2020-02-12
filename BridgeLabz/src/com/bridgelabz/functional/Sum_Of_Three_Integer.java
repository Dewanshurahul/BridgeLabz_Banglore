package com.bridgelabz.functional;

import java.util.Scanner;

public class Sum_Of_Three_Integer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many Elements you want to Enter.");
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i = 0;i<array.length;i++)
		{
			array[i] = sc.nextInt();
		}
		sc.close();
		for(int i = 0;i<array.length-2;i++)
		{
			for(int j = i+1;j<array.length-1;j++)
			{
				for(int k = j+1;k<array.length;k++)
				{
					if(array[i]+array[j]+array[k]==0)
						System.out.println(array[i]+" "+array[j]+" "+array[k]);
				}
			}
		}
	}
}
