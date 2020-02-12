package com.bridgelabz.jUnitTesting;

import java.util.Scanner;

public class DayOfWeek {
	public static String dayOfWeek(int day, int month, int year)
	{
		int y0 = year - (14-month)/12;
		int x = y0 + (y0/4) - (y0/100) + (y0/400);
		int m0 = month + 12*((14-month)/12) - 2;
		int d0 = ((day + x + (31*m0)/12))%7;
		switch(d0)
		{
		case 0: return "Sunday";
		case 1: return "Monday";
		case 2: return "Tuesday";
		case 3: return "Wednesday";
		case 4: return "Thrusday";
		case 5: return "Friday";
		case 6: return "Saturday";
		}
		return null;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date in Format dd/mon/yyyy");
		String sdate = sc.next();
		String stringDate[] = sdate.split("/");
		int day = Integer.parseInt(stringDate[0]);
		int month = Integer.parseInt(stringDate[1]);
		int year = Integer.parseInt(stringDate[2]);
		String remDay = dayOfWeek(day, month, year);
		System.out.println(remDay);
		sc.close();
	}
}
