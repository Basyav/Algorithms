package com.bas.binarysearch;

import java.util.Arrays;

public class Binary
{
    static boolean binarySearch(int[] sub, int value, int size) {
    	if ( size == 1)
    		if (sub[0] == value)
    			return true;
    		else return false;
    	if (value < sub[size/2])
    		return  binarySearch(Arrays.copyOfRange(sub, 0, size/2), value, size/2);
    	if (value > sub[size/2]) 
    		return binarySearch(Arrays.copyOfRange(sub, size/2, size), value, size/2);
    	return true;
    }
	
	public static void main( String[] args )
    {
        int[] a = {2,4,5,9,18,19,21,45};
    	System.out.println(binarySearch(a, 4, a.length));
    }
}