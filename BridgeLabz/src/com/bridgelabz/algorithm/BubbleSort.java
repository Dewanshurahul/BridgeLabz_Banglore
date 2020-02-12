package com.bridgelabz.algorithm;
public class BubbleSort {
	public static void bubbleSort(int ar[])
	{
		for (int i = 0; i < ar.length; i++) {
			for (int j = i+1; j < ar.length; j++) {
				if(ar[j] < ar[i])
				{
					int t = ar[i];
					ar[i] = ar[j];
					ar[j] = t;
				}
			}
		}
	}
	public static void main(String[] args) {
		int ar[] = { 54, 12, 15, 45, 78, 122 };
		bubbleSort(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}
}
