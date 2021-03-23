/**
* https://iq.opengenus.org/largest-element-in-an-array/
*
*
* FWe are given an integer array of size N or we can say number of elements is equal to N. 
* We have to find the largest/ maximum element in an array. The time complexity to solve 
* this is linear O(N) and space compexity is O(1). 
*
* Input
* {1, 2, 1, 3, 4, 3, 2}
* Output
* 4
*
* Input
* {11, 9, 18, 88, 99}
* Output
* 99
*
* Input
* {22, 3, 55, 4, 11, 45}
* Output
* 55
*/

import java.io.OutputStream;
//import java.util.Arrays;

public class LargestNumInArray {
	public static void main(String[] args){
		//int[] arrayInp = new int[]{1, 2, 1, 3, 4, 3, 2};
		//int[] arrayInp = new int[]{1, 9, 18, 88, 99};
		//int[] arrayInp = new int[]{22, 3, 55, 4, 11, 45};
		int[] arrayInp = new int[]{23, -34, 50, 33, 55, 43, 5, -66};

		LargestNumberInArray(arrayInp);
	}

	private static int LargestNumberInArray(int[] inpArray){	//without first sorting the array
		int largestNum = 0;
		int inpArrayLen = inpArray.length;
		int j=0, k=inpArrayLen-1;
		int tmp_j=0, tmp_k=0, tmp_l=0;

		while (j<=k){
			tmp_j = inpArray[j] > inpArray[j+1] ? inpArray[j] : inpArray[j+1];
			tmp_k = inpArray[k] > inpArray[k-1] ? inpArray[k] : inpArray[k-1];
			tmp_l = tmp_j > tmp_k ? tmp_j : tmp_k;
			largestNum = largestNum > tmp_l ? largestNum : tmp_l;
			j++;
			k--;
		}

		System.out.println("largestNum = "+largestNum);
		return largestNum;
	}

	
}