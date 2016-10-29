package com.bas.sorts;

public class Quick {
	
	static void changeElem(int[] a, int firstIndex, int secondIndex) {
		int temp = a[firstIndex];
		a[firstIndex] = a[secondIndex];
		a[secondIndex] = temp;
	}
	
	static int partition(int[] a, int firstIndex, int lastIndex) {
		// for randomize
		int rand = (int)(Math.random()*(lastIndex-firstIndex))+firstIndex;
		changeElem(a, rand, lastIndex);
		// for basically case
		int x = a[lastIndex];
		int i = firstIndex-1;
		for (int j = firstIndex; j < lastIndex; j++) {
			if (a[j] <= x) {
				i++;
				changeElem(a, i, j);
			}
		}
		changeElem(a, i+1, lastIndex);
		return i+1;
	}
	
	static void quickSort(int[] a, int firstIndex, int lastIndex) {
		if (firstIndex < lastIndex) {
			int x = partition(a, firstIndex, lastIndex);
			quickSort(a, firstIndex, x-1);
			quickSort(a, x+1, lastIndex);
		}
	}
}
				
			
		
		
		
	
