/**
* https://www.codechef.com/problems/LAPIN
*
*
* Lapindromes Problem Code: LAPIN
*
* Lapindrome is defined as a string which when split in the middle, gives two halves 
* having the same characters and same frequency of each character. If there are odd 
* number of characters in the string, we ignore the middle character and check for 
* lapindrome. For example gaga is a lapindrome, since the two halves ga and ga have 
* the same characters with same frequency. Also, abccab, rotor and xyzxy are a few 
* examples of lapindromes. Note that abbaab is NOT a lapindrome. The two halves 
* contain the same characters but their frequencies do not match. 
* 
* Your task is simple. Given a string, you need to tell if it is a lapindrome.
* 
* Input:
* First line of input contains a single integer T, the number of test cases.
* Each test is a single line containing a string S composed of only lowercase English 
* alphabet.
* 
* Output:
* For each test case, output on a separate line: "YES" if the string is a lapindrome 
* and "NO" if it is not.
* 
* Constraints:
* 1 ≤ T ≤ 100
* 2 ≤ |S| ≤ 1000, where |S| denotes the length of S
* 
* 
* Example:
* Input:
* 6
* gaga
* abcde
* rotor
* xyzxy
* abbaab
* ababc
*
* Output:
* YES
* NO
* YES
* YES
* NO
* NO 
*/
 
import java.io.OutputStream;
import java.lang.String;
import java.util.Arrays;


public class Lapindromes {
	
	public static void main(String[] args){
		//String inpString = "gaga";
		//String inpString = "abcde";
		//String inpString = "rotor";
		//String inpString = "xyzxy";
		//String inpString = "abbaab";
		//String inpString = "ababc";
		//String inpString = "gotrej";
		//String inpString = "abcabcbb";
		//String inpString = "bbbbb";
		//String inpString = "pwwkew";
		String inpString = "";

		LapindromeCheck(inpString);
	}

	public static String LapindromeCheck(String inputString){
		String isLapindrome = "NO";
		int strLen = inputString.trim().length();	

		if (strLen == 0) {
			System.out.println("Is BLANK a Lapindrome? : " + isLapindrome);
			return isLapindrome;
		}

		int halfLen = strLen / 2; 
		int evenOdd = 0;

		if (strLen % 2 > 0) {
			halfLen++; 
			evenOdd = 1; 
		}

		char[] inpChar = inputString.toCharArray();
		char[] inpLeft = new char[halfLen];
		char[] inpRight = new char[halfLen];
		
		System.arraycopy(inpChar, 0, inpLeft, 0, halfLen);
		
		/*for (char j : inpLeft)
			System.out.println("inpLeft char = " + j);*/

		System.arraycopy(inpChar, halfLen-evenOdd, inpRight, 0, halfLen);

		/*for (char j : inpRight)
			System.out.println("inpRight char = " + j);*/


		Arrays.sort(inpLeft);
		Arrays.sort(inpRight);

		if (Arrays.equals(inpLeft, inpRight)){
			isLapindrome = "YES";
		}

		System.out.println("Is " + inputString + " a Lapindrome? : " + isLapindrome);
		return isLapindrome;
	}


}

