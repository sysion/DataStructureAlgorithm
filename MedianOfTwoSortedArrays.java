/**
* https://leetcode.com/problems/median-of-two-sorted-arrays/
*
*
* 4. Median of Two Sorted Arrays
*
* Given two sorted arrays nums1 and nums2 of size m and n respectively, 
* return the median of the two sorted arrays.
*
* Example 1:
* Input: nums1 = [1,3], nums2 = [2]
* Output: 2.00000
* Explanation: merged array = [1,2,3] and median is 2.
*
* Example 2:
* Input: nums1 = [1,2], nums2 = [3,4]
* Output: 2.50000
* Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
*
* Example 3:
* Input: nums1 = [0,0], nums2 = [0,0]
* Output: 0.00000
*
* Example 4:
* Input: nums1 = [], nums2 = [1]
* Output: 1.00000
*
* Example 5:
* Input: nums1 = [2], nums2 = []
* Output: 2.00000
*
* Constraints:
* nums1.length == m
* nums2.length == n
* 0 <= m <= 1000
* 0 <= n <= 1000
* 1 <= m + n <= 2000
* -106 <= nums1[i], nums2[i] <= 106
*
* Follow up: The overall run time complexity should be O(log (m+n)).
*/

import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;

public class MedianOfTwoSortedArrays{

	public static void main(String[] args){
		//int[] NumFirstArray = new int[]{1, 2};
		//int[] NumSecondArray = new int[]{2};
		//int[] NumFirstArray = new int[]{1, 2};
		//int[] NumSecondArray = new int[]{3, 4};
		//int[] NumFirstArray = new int[]{0, 0};
		//int[] NumSecondArray = new int[]{0, 0};
		//int[] NumFirstArray = new int[]{};
		//int[] NumSecondArray = new int[]{1};
		int[] NumFirstArray = new int[]{2};
		int[] NumSecondArray = new int[]{};

		MedianTwoSortedArrays(NumFirstArray, NumSecondArray);
	}
	
	public static float MedianTwoSortedArrays(int[] firstArray, int[] secondArray){
		float median = 0.0f;
		int midPoint = 0;

		int[] combinedArray = Arrays.copyOf(firstArray, firstArray.length + secondArray.length);
		System.arraycopy(secondArray, 0, combinedArray, firstArray.length, secondArray.length);

		Arrays.sort(combinedArray);
		//System.out.println(Arrays.toString(combinedArray));

		if ((firstArray.length + secondArray.length) % 2 == 0){
			midPoint = (firstArray.length + secondArray.length) / 2;

			//-1 instead of +1 because array index is zero based
			median = (float)((combinedArray[midPoint] + combinedArray[midPoint-1])) / (float)2;
		}
		else {
			//-1 instead of +1 because array index is zero based
			midPoint = (firstArray.length + secondArray.length - 1) / 2;

			median = (float)(combinedArray[midPoint]);
		}

		//median = (float)Math.round(median * 100000f) / 100000f;
		//median = String.format("%.5f", median);
		System.out.println(String.format("%.5f", median));
		
		return median;
	}



}//