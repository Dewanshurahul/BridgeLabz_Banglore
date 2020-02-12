package com.bridgelabz.algorithm;

public class InsertionSort {
	public static void insertionSort(String array[])
	{
		for(int i = 1;i<array.length;i++)
		{
			int t =i-1;
			String temp = array[i];
			while(t>=0 && temp.compareTo(array[t])<0)
			{
				array[t+1] = array[t];
				t--;
			}
			array[t+1] = temp;
		}
	}
	public static void main(String[] args) {
		String st[] = { "Raman", "Rahul", "Dewanshu" };
		insertionSort(st);
		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i]+" ");
		}
	}
}
