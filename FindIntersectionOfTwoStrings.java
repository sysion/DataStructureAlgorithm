/**
* https://www.coderbyte.com/
*
*
* Find Intersection
*
* Have the function FindIntersection(strArr) read the array of strings stored in strArr 
* which will contain 2 elements: the first element will represent a list of comma-separated 
* numbers sorted in ascending order, the second element will represent a second list of 
* comma-separated numbers (also sorted). Your goal is to return a comma-separated string 
* containing the numbers that occur in elements of strArr in sorted order. If there is no 
* intersection, return the string false.
*
* Examples
* Input: ["1, 3, 4, 7, 13", "1, 2, 4, 13, 15"]
* Output: 1,4,13
*
* Input: ["1, 3, 9, 10, 17, 18", "1, 4, 9, 10"]
* Output: 1,9,10
*/

import java.io.OutputStream;
import java.util.Arrays;

public class FindIntersectionOfTwoStrings {
	public static void main(String[] args){
		//String[] inpString = {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
		String[] inpString = {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"};
		//String[] inpString = {"2, 3, 8, 12, 17, 18", "1, 4, 9, 10"};

		FindIntersection(inpString);
	}

	public static String FindIntersection(String[] strArr){
		String result = "";
		String[] tmpFirst = strArr[0].split(",");
		String[] tmpSecond = strArr[1].split(",");


		//result = result.substring(0, result.length()-1);
		result = result.isEmpty() ? "false" : result.substring(0, result.length()-1);

		System.out.println("result = "+ result);

		return result; 
	}

}

/*
javac FindIntersectionOfTwoStrings.java 
FindIntersectionOfTwoStrings.java:31: error: incompatible types: String cannot be converted to String[]
    	System.out.print(FindIntersection(s.nextLine()));
    	                                            ^
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
1 error
*/