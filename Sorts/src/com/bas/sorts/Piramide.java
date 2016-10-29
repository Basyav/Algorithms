package com.bas.sorts;

public class Piramide {
	
	static void changeElem(int[] a, int firstIndex, int secondIndex) {
		int temp = a[firstIndex];
		a[firstIndex] = a[secondIndex];
		a[secondIndex] = temp;
	}
	
	static void maxHeapify(int[] a, int i, int heapSize) {
		int left =2*i+1;
		int right = 2*i+2;
		int largest;
		if (left <= heapSize && a[left] > a[i]) {
			largest = left;
		}
		else largest = i;
		if (right <= heapSize && a[right] > a[largest]) {
			largest = right;
		}
		if (largest != i) {
			changeElem(a,  largest, i);
			maxHeapify(a, largest, heapSize);
		}
	}
	
	static void buildMaxHeap(int[] a) {
		int k = a.length/2-1;
		for(int i = k; i >=0; i--) {
			maxHeapify(a, i, a.length-1);
		}
	}
	
	static void heapSort(int[] a) {
		buildMaxHeap(a);
		int heapSize = a.length-1;
		for (int i = a.length-1; i >= 1; i--) {
			changeElem(a, i, 0);
			heapSize--;
			maxHeapify(a, 0, heapSize);
		}
	}
}
		
