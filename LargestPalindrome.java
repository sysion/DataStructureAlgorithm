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
import java.lang.Math;

public class LargestPalindrome{
	

	public static void main(String[] args){
		LargestPalindromeProduct(8);
	}

	public static int LargestPalindromeProduct(int n){
		long largestPalindromeProduct = 0;
		boolean found = false;

		/*firstMaxNum and secondMaxNum should be declared as long to accomodate large 
		  numbers. From n>=5, numProduct = firstMaxNum * secondMaxNum was returning
		  wrong result when firstMaxNum and secondMaxNum are declared as int*/ 
		long firstMaxNum = (long)Math.pow(10,(double)n) - 1;
		long secondMaxNum = (long)Math.pow(10,(double)n) - 1;

		//System.out.println("firstMaxNum = "+firstMaxNum+", secondMaxNum = "+secondMaxNum);

		while (! found && secondMaxNum != 0) {
			long numProduct = firstMaxNum * secondMaxNum;
			int lenNumProduct = (int) Math.log10(numProduct) + 1;

			//System.out.println("numProduct = "+numProduct);
			//System.out.println("lenNumProduct = "+lenNumProduct);

			int[] NumProductArray = new int[lenNumProduct];

			int j = lenNumProduct - 1;
			long savedNumber = numProduct;

			while (j >= 0){	//break number into array
				long tmpNumber = (savedNumber / (long)Math.pow(10, j));
				NumProductArray[j] = (int)tmpNumber;
				savedNumber = savedNumber - (tmpNumber * (long)Math.pow(10, j));
				j--;
			}

			/*for (int q=0; q<lenNumProduct;q++)
				System.out.println("NumProductArray["+q+"] = "+NumProductArray[q]);*/

			int k = 0, m = lenNumProduct - 1;
			boolean palind = true;

			while (k <= m){
				if (NumProductArray[k] == NumProductArray[m]){
					palind = true;
				}
				else {
					palind = false;
					break;
				}
				k++; m--;
			}

			if (! palind){
				secondMaxNum--;
			}
			else {
				largestPalindromeProduct = largestPalindromeProduct > numProduct ? largestPalindromeProduct : numProduct;
				//System.out.println("largestPalindromeProduct = "+largestPalindromeProduct);
				found = true;
			}


		}
		
		//System.out.println("RESULT = "+largestPalindromeProduct % 1337);

		return (int)(largestPalindromeProduct % 1337);
	}

}