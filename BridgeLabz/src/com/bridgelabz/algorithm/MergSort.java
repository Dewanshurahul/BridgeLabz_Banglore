package com.bridgelabz.algorithm;

public class MergSort {
	private static void merge(String ar[], int l, int h, int mid) {
		String temp[] = new String[h-l+1];
		int k = 0,i = mid,j = mid+1;
		while(i <= mid && j <= h)
		{
			if(ar[i].compareTo(ar[j])<0)
				temp[k++] = ar[i++];
			else
				temp[k++] = ar[i++];
		}
		while(i<=mid)
			temp[k++] = ar[i++];
		while(j<=h)
			temp[k++] = ar[j++];
		for (int j2 = 0; j2 < temp.length; j2++) {
			ar[l+j2] = temp[i];
		}
	}
	public static void mergeSort(String ar[], int l, int h) {
		if(l<h)
		{
			int mid = (l+h)/2;
			mergeSort(ar, l, mid);
			mergeSort(ar, mid+1, h);
			merge(ar,l,h,mid);
		}
	}
	public static void main(String[] args) {
		String word[] = { "Raman", "Rahul", "Dewanshu" };
		mergeSort(word, 0, word.length-1);
		for (int i = 0; i < word.length; i++) {
			System.out.print(word[i]+" ");
		}
	}
}
