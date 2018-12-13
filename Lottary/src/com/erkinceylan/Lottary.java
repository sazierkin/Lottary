package com.erkinceylan;

import java.util.Random;

public class Lottary {
	public Random rand;
	
	public Lottary()
	{
		rand = new Random();
	}
	
	public int[] getColumn()
	{
		int [] column = new int[6];
		boolean repeat;
		boolean[] status = new boolean[50];
		int val;
		
		for (int i = 0; i < 6; ++i) {
			do {
				repeat = false;
				val = rand.nextInt(49) + 1;
				if (status[val])
					repeat = true;				
			} while (repeat);	
			
			status[val] = true;
		}
		
		int index = 0;
		
		for (int i = 1; i < 50; ++i)
			if (status[i])
				column[index++] = i;
		
		return column;
	}
}
