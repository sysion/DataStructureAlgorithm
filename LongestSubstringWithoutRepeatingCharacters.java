/**
* https://leetcode.com/problems/longest-substring-without-repeating-characters/
*
*
* 3. Longest Substring Without Repeating Characters
*
* Given a string s, find the length of the longest substring without repeating 
* characters. 
*
* Example 1:
* Input: s = "abcabcbb"
* Output: 3
* Explanation: The answer is "abc", with the length of 3.
*
* Example 2:
* Input: s = "bbbbb"
* Output: 1
* Explanation: The answer is "b", with the length of 1.
* 
* Example 3:
* Input: s = "pwwkew"
* Output: 3
* Explanation: The answer is "wke", with the length of 3.
* Notice that the answer must be a substring, "pwke" is a subsequence and not a 
* substring.
*
* Example 4:
* Input: s = ""
* Output: 0
* 
* Constraints:
* 0 <= s.length <= 5 * 10^4
* s consists of English letters, digits, symbols and spaces.
*/
 
import java.io.OutputStream;
import java.lang.Character;


public class LongestSubstringWithoutRepeatingCharacters {
	
	public static void main(String[] args){
		String inpString = "abcabcbb";
		//String inpString = "bbbbb";
		//String inpString = "pwwkew";
		//String inpString = "";

		LongestSubstringNoCharactersRepeated(inpString);
	}

	public static int LongestSubstringNoCharactersRepeated(String inputString){
		String outputString = "";
		int strLen = inputString.trim().length();	//int variable can accomodate 5 * 10^4 string length
		String firstCharacter = "";

		//System.out.println("strLen = "+strLen);

		if (strLen == 0 || inputString.isEmpty() || inputString.equals("\\s+")) {
			System.out.println("RESULT: outputString = "+outputString+", Length = "+outputString.length());
			return 0;
		}

		inputString = inputString.substring(1, strLen);	//chop off first character (string count from 0)
		strLen = inputString.length();
		//System.out.println("strLen = "+strLen+", inputString = "+inputString);

		while (strLen > 0){
			int j = 0;
			char ch = inputString.charAt(j);
			//System.out.println("ch = "+ch);
			
			if (outputString.indexOf(Character.toString(ch)) == -1){
				outputString += Character.toString(ch);
				//System.out.println("outputString = "+outputString);
			}
			else {
				inputString = inputString.substring(1, strLen); 	//chop off first character
				strLen = inputString.length();
				continue;
			}

			inputString = inputString.substring(1, strLen); 	//chop off first character
			strLen = inputString.length();
			//System.out.println("strLen (final)= "+strLen);
		}
		
		
		//System.out.println("RESULT: outputString = "+outputString+", Length = "+outputString.length());

		return outputString.length();
	}


}