/**
* https://www.coderbyte.com/
*
*
* First Factorial
*
* Have the function FirstFactorial(num) take the num parameter being passed and 
* return the factorial of it. For example: if num = 4, then your program should 
* return (4 * 3 * 2 * 1) = 24. For the test cases, the range will be between 1 
* and 18 and the input will always be an integer.
*
* Examples
* Input: 4
* Output: 24
*
* Input: 8
* Output: 40320
*/

import java.util.Scanner;
import java.io.OutputStream;

public class FirstFactorial {
	public static void main(String[] args){
		int inpNumber = 4;

		FirstFactorialOfNumber(inpNumber);

	}

	public static int FirstFactorialOfNumber(int num){
		int result = 1;

		for (int j=num; j>0; j--){
			result *= j;
		}

		System.out.println(result);
		return result;
	}



}
