package com.bas.sorts;

import java.util.Arrays;

public class TestClass {

	public static void main(String[] args) {
		int[] a = {2,8,4,1,3,5,6,7};
		int [] b = {2,4,5};
		//System.out.println(Arrays.toString(SortMerge.mergeSort(a)));
		//QuickSort.sortQuick(a, 0, a.length-1);
		//SortMerge.mergeSort(a);
		Piramide.heapSort(a);
		System.out.println(Arrays.toString(a) );

	}

}
