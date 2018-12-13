package com.erkinceylan;

import java.util.Scanner;

import com.erkinceylan.ArrayUtil;
import com.erkinceylan.Lottary;

public class TestCode {
	public static void main (String [] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("How many coloumn would you like to play? ");
		int n = Integer.parseInt(kb.nextLine());
		
		Lottary lottary = new Lottary();
		
		for (int i = 0; i < n; ++i)
			ArrayUtil.display(lottary.getColumn(), 2);
		
			
			
	}
}
