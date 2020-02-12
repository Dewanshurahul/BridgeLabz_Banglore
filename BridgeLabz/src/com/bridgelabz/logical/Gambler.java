package com.bridgelabz.logical;
import java.util.Scanner;
public class Gambler {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Stake");
		int stake = sc.nextInt();
		System.out.println("Set Goal");
		int goal = sc.nextInt();
		System.out.println("Enter the Nubmer Of Times You Want to Play");
		int count = sc.nextInt();
		sc.close();
		int numberOfBets = 0;
		int win = 0;
		while(true)
		{
			double bet = Math.random();
			if(bet>=0.5)
			{
				win++;
				stake++;
			}
			else
				stake--;
			numberOfBets++;
			if(stake==0 || stake==goal || numberOfBets==count)
				break;
		}
		System.out.println("Money the gambler have  : "+stake);
		System.out.println("Number of times Played : "+numberOfBets);
		System.out.println("Number of Wins : "+win);
		System.out.println("Percentage of Wins : "+(win*100)/numberOfBets);
		System.out.println("Percntage of Loss : "+((numberOfBets-win)*100)/numberOfBets);
	}
}
