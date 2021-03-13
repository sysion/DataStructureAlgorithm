/**
* https://leetcode.com/problems/two-sum-less-than-k/
*
* 1. Two Sum Less Than K
*
* Given an array A of integers and integer K, return the maximum S such that  
* there exists i < j with A[i] + A[j] = S and S < K. If no i, j exist satisfying 
* this equation, return -1.
*
* Example 1:
* Input: A = [34,23,1,24,75,33,54,8], K = 60
* Output: 58
* Explanation: 
* We can use 34 and 24 to sum 58 which is less than 60.
*
* Example 2:
* Input: A = [10,20,30], K = 15
* Output: -1
* Explanation: 
* In this case it's not possible to get a pair sum less that 15.
*
* Note:
* 1 <= A.length <= 100
* 1 <= A[i] <= 1000
* 1 <= K <= 2000
*/

import java.io.OutputStream;
import java.util.Arrays;

public class TwoSumLessThanTarget {
	public static void main(String[] args){
		//int[] inputArray = new int[]{34,23,1,24,75,33,54,8};
		//int targetSum = 60;
		int[] inputArray = new int[]{10,20,30};
		int targetSum = 15;
		
		SumTwoNumbersLessThanTarget(inputArray, targetSum);
	}

	private static int SumTwoNumbersLessThanTarget(int[] intArray, int target){
		int SumLessThanTarget = -1;

		Arrays.sort(intArray);
		int j = 0, k = intArray.length - 1;

		while (j < k){
			if (intArray[j] + intArray[k] < target){
				SumLessThanTarget = SumLessThanTarget > (intArray[j] + intArray[k]) ? SumLessThanTarget : intArray[j] + intArray[k];
				j++;
			}
			else k--;
		}
		
		//System.out.println(SumLessThanTarget);

		return SumLessThanTarget;
	}

}//