package com.bridgelabz.functional;
import java.util.Scanner;
public class WindChill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in Fahrenheit");
		int t = sc.nextInt();
		System.out.println("Enter Speed of Wind(Miles Per Hour)");
		int v = sc.nextInt();
		double w=0;
		if(t<=50 || (v>=3 && v<=120))
		{
			w = 35.74 + (0.6215*t) + ((0.4275*t)-35.75)*Math.pow(v, 0.16);
			System.out.println(w);
		}
		else
			System.out.println("Either Wind Speed Or Temperature is Not Matching");
		sc.close();
	}
}
