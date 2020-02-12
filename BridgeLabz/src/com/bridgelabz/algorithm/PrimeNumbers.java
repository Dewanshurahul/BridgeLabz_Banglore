package com.bridgelabz.algorithm;
public class PrimeNumbers {
	public static boolean primeNumber(int number)
	{
		if(number==0 || number==1)
			return false;
		for (int i = 2; i <= number/2; i++) {
			if(number%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		for(int i = 0;i<1000;i++)
		{
			boolean prime = primeNumber(i);
			if(prime)
				System.out.print(i+" ");
		}
	}
}
