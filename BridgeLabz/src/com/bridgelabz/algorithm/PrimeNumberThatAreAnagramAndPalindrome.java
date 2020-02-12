package com.bridgelabz.algorithm;
public class PrimeNumberThatAreAnagramAndPalindrome extends PrimeNumbers {
	/*public static boolean anagram(String st1, String st2)
	{
		if(st1.length()!=st2.length())
			return false;
		int character[] = new int[26];
		for (int i = 0; i < st1.length(); i++) {
			if(st1.charAt(i)>='A'&& st1.charAt(i)<='Z')
				character[st1.charAt(i)-65]++;
			if(st1.charAt(i)>='a'&& st1.charAt(i)<='z')
				character[st1.charAt(i)-97]++;
		}
		for (int i = 0; i < st1.length(); i++) {
			if(st2.charAt(i)>='A'&& st2.charAt(i)<='Z')
				character[st2.charAt(i)-65]--;
			if(st2.charAt(i)>='a'&& st2.charAt(i)<='z')
				character[st2.charAt(i)-97]--;
		}
		for(int i = 0;i<character.length;i++)
		{
			if(character[i]!=0)
				return false;
		}
		return true;
	}*/
	public static boolean palindrome(int n) {
		int i = 0;
		int t = n;
		do {
			int x = n%10;
			i = i*10+x;
			n = n/10;
		}while(n!=0);
		return i==t;
	}
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			if(primeNumber(i) && palindrome(i))
				System.out.print(i+" ");
		}
	}
}
