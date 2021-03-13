/**
* https://leetcode.com/problems/two-sum/
* 
* Two Sum Less Than K
*
* Given an array of integers nums and an integer target, return indices of the 
* two numbers such that they add up to target.
*
* You may assume that each input would have exactly one solution, and you may 
* not use the same element twice.
*
* You can return the answer in any order.
*
* Example 1:
* Input: nums = [2,7,11,15], target = 9
* Output: [0,1]
* Output: Because nums[0] + nums[1] == 9, we return [0, 1].
*
* Example 2:
* Input: nums = [3,2,4], target = 6
* Output: [1,2]
*
* Example 3:
* Input: nums = [3,3], target = 6
* Output: [0,1]
* 
* Constraints:
*
* 2 <= nums.length <= 10^3
* -10^9 <= nums[i] <= 10^9
* -10^9 <= target <= 10^9
* Only one valid answer exists.
*/

import java.io.OutputStream;
import java.util.Arrays;

public class TwoSumEqualToTarget {
	public static void main(String[] args){
		int[] inputArray = new int[]{2,7,11,15};
		int targetSum = 9;
		//int[] inputArray = new int[]{3,2,4};
		//int targetSum = 6;
		//int[] inputArray = new int[]{3,3};
		//int targetSum = 6;
		
		SumTwoNumbersEqualToTarget(inputArray, targetSum);
	}

	private static int[] SumTwoNumbersEqualToTarget(int[] intArray, int target){
		int[] SumEqualToTarget = new int[2];

		Arrays.sort(intArray);
		int j = 0, k = intArray.length - 1;

		while (j < k){
			if (intArray[j] + intArray[k] == target){
				SumEqualToTarget[0] = j; 
				SumEqualToTarget[1] = k;
				break;
			}
			else if (intArray[j] + intArray[k] < target){
				j++;
			}
			else if (intArray[j] + intArray[k] > target){
				k--;
			}
		}
		
		//System.out.println("["+SumEqualToTarget[0]+", "+SumEqualToTarget[1]+"]");

		return SumEqualToTarget;
	}

}//