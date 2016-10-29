package com.bas.sorts;

import java.util.Arrays;

public class Merge {

	static int[] merge(int [] a, int[] b) {
		int size_a = a.length;
		int size_b = b.length;
		if (size_a == 0) return b;
		if (size_b == 0) return a;
		int[] c = new int[size_a+size_b];
		int i = 0, j = 0, k = 0;
		while (i < size_a && j < size_b) {
			if (b[j] < a[i]) {
				c[k] = b[j];
				j++;
			}
			else {
				c[k] = a[i];
				i++;
			}
			k++;
		}
		while (k < c.length) {
			if (i == size_a) {
				c[k] = b[j];
				j++;
			}
			else {
				c[k] = a[i];
				i++;
			}
			k++;
		}
		return c;
			
	}
	
	static int[] mergeSort(int[] a) {
		int size = a.length;
		if (size == 1) return a;
		int[] leftHalf = Arrays.copyOfRange(a, 0, size/2);
		int[] rightHalf = Arrays.copyOfRange(a, size/2, size);
		int[] tempL = mergeSort(leftHalf);
		int[] tempR = mergeSort(rightHalf);
		int[] tempMerge = merge(tempL, tempR);
		return tempMerge;
		//return sortAndMerge(mergeSort(leftHalf), mergeSort(rightHalf));
	}
}
		
