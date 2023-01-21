/**
 * You may be familiar with the concept of combinations: for example, 
 * if you take 5 cards from a 52 cards deck as you would playing poker, 
 * you can have a certain number (2,598,960, would you say?) of different combinations.
 * 
 * In mathematics the number of k combinations you can have taking from a set of n elements 
 * is called the binomial coefficient of n and k, more popularly called n choose k.
 * 
 * The formula to compute it is relatively simple: n choose k==n!/(k!*(n-k)!), 
 * where ! of course denotes the factorial operator.
 * 
 * You are now to create a choose function that computes the binomial coefficient, like this:
 * 
 * choose(1,1)==1
 * choose(5,4)==5
 * choose(10,5)==252
 * choose(10,20)==0
 * choose(52,5)==2598960
 * 
 * Be warned: a certain degree of optimization is expected, both to deal with larger numbers precision (and their rounding errors in languages like JS) and computing time.
 * 
 */
package codewars;

import java.math.BigInteger;
public class QuickCals {

	public static void main(String[] args) {
		System.out.println(choose(100, 34));
	}

	public static BigInteger choose(int n, int p) {
		if (p == 0) {
			return BigInteger.ONE;
		}
		return choose(n, p - 1).multiply(BigInteger.valueOf(n - p + 1)).divide(BigInteger.valueOf(p));
	}
}
