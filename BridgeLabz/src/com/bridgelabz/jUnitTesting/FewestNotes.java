package com.bridgelabz.jUnitTesting;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class FewestNotes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount to calculate Least Number of Notes");
		int money = sc.nextInt();
		int count = 0;
		int notes[] = { 0, 0, 0, 0, 0, 0 , 0, 0 };
		Map<Integer, Integer> note = new TreeMap<>();
		note.put(1, 0);
		note.put(2, 0);
		note.put(5, 0);
		note.put(10, 0);
		note.put(50, 0);
		note.put(100, 0);
		note.put(500, 0);
		note.put(1000, 0);
		sc.close();
		while(money>=1000)
		{
			money = money-1000;
			count ++;
			notes[7]++;
		}
		while(money>=500)
		{
			money = money-500;
			count ++;
			notes[6]++;
		}while(money>=100)
		{
			money = money-100;
			count ++;
			notes[5]++;
		}
		while(money>=50)
		{
			money = money-50;
			count ++;
			notes[4]++;
		}
		while(money>=10)
		{
			money = money-10;
			count ++;
			notes[3]++;
		}
		while(money>=5)
		{
			money = money-5;
			count ++;
			notes[2]++;
		}
		while(money>=2)
		{
			money = money-2;
			count ++;
			notes[1]++;
		}
		while(money>=1)
		{
			money = money-1;
			count ++;
			notes[0]++;
		}
		System.out.println("Total "+" "+count+" Notes Needed");
		System.out.println("Amount of '1' Notes are : "+notes[0]);
		System.out.println("Amount of '2' Notes are : "+notes[1]);
		System.out.println("Amount of '5' Notes are : "+notes[2]);
		System.out.println("Amount of '10' Notes are : "+notes[3]);
		System.out.println("Amount of '50' Notes are : "+notes[4]);
		System.out.println("Amount of '100' Notes are : "+notes[5]);
		System.out.println("Amount of '500' Notes are : "+notes[6]);
		System.out.println("Amount of '1000' Notes are : "+notes[7]);
		sc.close();
	}
}
