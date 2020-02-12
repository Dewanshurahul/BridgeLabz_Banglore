package com.bridgelabz.algorithm;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class BinarySearch {
	public static boolean binarySearch(String ar[],int f, int l,String word)
	{
		if(f<l)
		{
			int mid = (f+l)/2;
			if(ar[mid].equalsIgnoreCase(word))
				return true;
			else if(ar[mid].compareToIgnoreCase(word)>0)
				return binarySearch(ar, mid+1, l, word);
			else if(ar[mid].compareToIgnoreCase(word)<0)
				return binarySearch(ar, f, mid-1, word);
		}
		return false;
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		FileReader fr = new FileReader("C:\\Users\\HULK\\Desktop\\Java_Exception\\Test1.txt");
		int i = 0;
		String st = "";
		while((i=fr.read())!=-1)
		{
			st = st + (char)i;
		}
		System.out.println(st);
		String search = sc.next();
		sc.close();
		String word[] = st.split(",");
		boolean find = binarySearch(word, 0, word.length, search);
		if(find)
			System.out.println("Word found");
		else
			System.out.println("Word not Found");
		fr.close();
	}
}
