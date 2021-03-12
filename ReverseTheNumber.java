/**
* https://www.codechef.com/LRNDSA01/problems/FLOW007
*
*
* Reverse The Number Problem Code: FLOW007
* Given an Integer N, write a program to reverse it.
* 
* Input
* The first line contains an integer T, total number of testcases. Then follow 
* T lines, each line contains an integer N.
* 
* Output
* For each test case, display the reverse of the given number N, in a new line.
*
*
* Examples
* Input
* 4
* 12345
* 31203
* 2123
* 2300
*
* Output
* 4
* 54321
* 30213
* 3212
* 32
*
* Time Limit:	1 secs
* Source Limit:	50000 Bytes
*/

import java.util.Scanner;
import java.io.OutputStream;
import java.lang.Math;

public class ReverseTheNumber {
	public static void main(String[] args){
		//int inpNumber = 4;
		int inpNumber = 12345;
		//int inpNumber = 31203;
		//int inpNumber = 2123;
		//int inpNumber = 2300;

		ReverseTheGivenNumber(inpNumber);
	}

	public static int ReverseTheGivenNumber(int num){
		int numReverse = 0;
		int numLen = (int)Math.log10(num) + 1;

		int base10 = 10;
		int tmpNum = 0;
		int powExp = 1;

		while (powExp <= numLen){
			tmpNum = num / base10;
			tmpNum = tmpNum * base10;
			numReverse += (num - tmpNum) * (int)Math.pow(base10, numLen - powExp);
			
			num = tmpNum / base10;
			tmpNum = 0;
			powExp++;
		}

		//System.out.println("numReverse = "+numReverse);

		return numReverse;
	}



}