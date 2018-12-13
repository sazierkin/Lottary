package com.erkinceylan;

public class ArrayUtil {

	public static void display(int [] a, int n)
	{
		String fmt = String.format("%%0%dd ", n);
		
		for (int val : a)
			System.out.printf(fmt, val);
		
		System.out.println();		
	}
}
