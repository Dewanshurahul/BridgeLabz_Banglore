package com.bridgelabz.algorithm;
import java.util.Scanner;
public class Anagram {
	public static boolean anagram(String st1, String st2)
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
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String firstString = sc.next();
		System.out.println("Enter Secoond String");
		String secondString = sc.next();
		sc.close();
		boolean check = anagram(firstString, secondString);
		if(check)
			System.out.println("These two Strings are Anagram");
		else
			System.out.println("These two Strings are not Anagram");
	}
}
