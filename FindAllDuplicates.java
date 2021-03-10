/**
* https://leetcode.com/problems/find-all-duplicates-in-an-array/
*
*
* Find All Duplicates in an Array
*
* Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements 
* rappear twice and others appear once.
* Find all the elements that appear twice in this array.
* Could you do it without extra space and in O(n) runtime?
*
* Examples
* Input: [4, 3, 2, 7, 8, 2, 3, 1]
* Output: [2, 3]
*
* Input: [1, 2, 3, 6, 3, 6, 1]
* Output: [3]
*
*/

import java.io.OutputStream;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class FindAllDuplicates{
	
	public static void main(String[] args){
		int[] inputArray = { 4, 3, 2, 7, 8, 2, 3, 1 };
		//int[] inputArray = {1, 2, 3, 6, 3, 6, 1};

		FindAllDuplicatesInArray(inputArray);
	}

	public static int[] FindAllDuplicatesInArray(int[] inpArray){
		int size = Math.floorDiv(inpArray.length, 2);
		int[] resultArray = new int[size];

		Arrays.sort(inpArray);

		int j=0, k=inpArray.length-1, idx=0;

		while (j<k){
			if (inpArray[j] == inpArray[j+1]){
				resultArray[idx] = inpArray[j];
				idx++;
				j=j+2;			
			}
			else j++;

			if (inpArray[k] == inpArray[k-1]){
				resultArray[idx] = inpArray[k];
				idx++;
				k=k-2;			
			}
			else k--;
		}

		int[] result = new int[idx]; 

		for (int i=0; i<idx; i++){
			result[i] = resultArray[i]; 
		}

		Arrays.sort(result);

		/*for (int i=0; i<idx; i++){
			System.out.println(result[i]);
		}*/
		
		return result;
	}
}