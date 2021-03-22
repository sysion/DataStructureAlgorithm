/**
* https://www.educative.io/edpresso/find-the-integer-that-appears-once-in-an-array
*
*
* Find the integer that appears once in an array
*
* Given a non-empty array of integers, where every element appears twice except 
* for one, find that single one (assume that no other integer occurs once).
*
* Input
* {1, 2, 1, 3, 4, 3, 2}
* 
* Output
* 4
*
*/

import java.io.OutputStream;
import java.util.Scanner;
import java.util.Arrays;


public class NumberAppearsOnce {
	public static void main(String[] args){
		int[] arrayInp = new int[]{1, 2, 1, 3, 4, 3, 2};			//4
		//int[] arrayInp = { 5, 1, 8, 8, 4, 1, 5, 7, 3, 7, 3 };		//4
		//int[] arrayInp = { 5, 6, 2, 4, 1, 5, 1, 6, 4 };			//2

		NumberAppearsOnceInArray(arrayInp);
	}

	private static int NumberAppearsOnceInArray(int[] inpArray){
		int uniqueNumber = -1;
		Arrays.sort(inpArray);
		int j=0, k=inpArray.length - 1;

		while (j <= k) {
			if (inpArray[j] == inpArray[j+1]) {
				j = j+2;
			}
			else {
				uniqueNumber = inpArray[j];
				break;
			}

			if (inpArray[k] == inpArray[k-1]) {
				k = k-2;
			}
			else {
				uniqueNumber = inpArray[k];
				break;
			}
		}

		//XOR solution - ideal when array is not sorted
		/*int uniqueNumber = inpArray[0];
		for (int j=1; j<inpArray.length; j++) {
			uniqueNumber ^=  inpArray[j];
		}*/
	
		
		System.out.println("uniqueNumber = "+uniqueNumber);
		return uniqueNumber;
	}
}