package com.bridgelabz.algorithm;
public class GenericSearchingAndSorting<T> {
	T value;
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
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
}
