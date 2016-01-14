package com.robin.exam;

import java.util.HashSet;

/*
 * Write an algorithm to determine if a number is happy.
 * A happy number is a number defined by the following process: 
 * Starting with any positive integer, replace the number by the sum of the squares of its digits, 
 * and repeat the process until the number equals 1 (where it will stay), 
 * or it loops endlessly in a cycle which does not include 1. 
 * Those numbers for which this process ends in 1 are happy numbers.
 */
public class HappyNumber {
	public static void Test()
	{
		HappyNumber hn = new HappyNumber();
		System.out.println(true == hn.isHappy(333));
	}
	
    /**
     * @param n an integer
     * @return true if this is a happy number or false
     */
    public boolean isHappy(int n) {
		if(n == 1) { return true; }
		if(n <= 0) { return false; }
		
	    HashSet<Integer> hs = new HashSet<Integer>();

	    int m = n;
	    
	    while(!hs.contains(m))
	    {
	    	if( m == 1 ) return true;
	    	
	    	hs.add(m);
	    	
	    	int sum = 0;

	    	while(m > 0)
	    	{
		    	int k = m % 10;
		    	sum += k * k;
		    	m /= 10;	    	
	    	}
	    	
	    	m = sum;
	    }
	    
	    return false;
    }
}

