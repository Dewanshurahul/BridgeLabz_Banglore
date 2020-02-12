package com.bridgelabz.basics;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name.");
		String name = sc.nextLine();
		String given = "Hello <<UserName>>, How are you?";
		Pattern pattern = Pattern.compile("<<UserName>>");
		Matcher matcher = pattern.matcher(given);
		if(matcher.find())
			given = given.replace("<<UserName>>", name);
		System.out.println(given);
		sc.close();
	}
}
