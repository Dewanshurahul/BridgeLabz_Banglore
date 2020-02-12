package com.bridgelabz.basics;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enterhow many times you want to flip coin");
		int num = sc.nextInt();
		int tails = 0;
		int count = 0;
		sc.close();
		while(count<num)
		{
			double random = Math.random();
			if(random < 0.5)
				tails++;
			count++;
		}
		System.out.println(count);
		System.out.println(tails);
		double per = (double)((count-tails)*100)/count;
		System.out.println("Percentage of heads : "+per);
	}
}
