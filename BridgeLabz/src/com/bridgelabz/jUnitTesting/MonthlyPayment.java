package com.bridgelabz.jUnitTesting;

public class MonthlyPayment {
	public static double monthlyPayment(int principal, int year, int rate)
	{
		int n = year*12;
		int r = rate/(12 *100);
		double interest = (principal*r)/(1 - Math.pow((1+r), (-1*n)));
		return interest;
	}
}
