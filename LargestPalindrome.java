/**
* https://leetcode.com/problems/largest-palindrome-product/
*
*
* 479. Largest Palindrome Product
*
* Find the largest palindrome made from the product of two n-digit numbers.
* Since the result could be very large, you should return the largest 
* palindrome mod 1337.
* 
*
* Examples
* Input: 2
* Output: 987
*
* Explanation: 99 x 91 = 9009, 9009 % 1337 = 987
*
* Note:
* The range of n is [1,8].
*/

import java.io.OutputStream;

public class LargestPalindrome{
	

	public static void main(String[] args){
		LargestPalindromeProduct(99, 91);
	}

	public static int LargestPalindromeProduct(int numOne, int numTwo){
		int largestPalindromeProduct = 0;
		
		return largestPalindromeProduct % 1337;
	}

}