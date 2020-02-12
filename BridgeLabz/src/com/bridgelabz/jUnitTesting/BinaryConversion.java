package com.bridgelabz.jUnitTesting;

import java.util.Scanner;

public class BinaryConversion {
	public static String toBinary(int n)
	{
		String binary ="";
		do
		{
			int x = n%2;
			binary = x+binary;
			n= n/2;
		}while(n!=0);
		while(binary.length()!=32)
		{
			binary = 0 + binary;
		}
		return binary;
	}
	public static double swapNibble(String binary)
	{
		int i = 0;
		int k = binary.length();
		String nibbles[] = new String[8];
		while(i<8)
		{
			String nibble = "";
			for(int j = k-4;j < k; j++)
			{
				nibble = nibble + binary.charAt(j);
			}
			k = k-4;
			nibbles[i] = nibble;
			i++;
		}
		String newBinary = "";
		for(int n = 0;n<nibbles.length;n++)
		{
			newBinary = newBinary + nibbles[n];
		}
		double newNumber = 0;
		for (int j = 0; j < newBinary.length(); j++) {
			newNumber = newNumber + newBinary.charAt(i)*Math.pow(2, j);
		}
		return newNumber;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String st = toBinary(n);
		System.out.println(st);
		int str = (int)swapNibble(st);
		System.out.println(str);
		
		
		sc.close();
	}
}
