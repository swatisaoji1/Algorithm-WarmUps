import java.util.Scanner;

/*Alice recently started learning about cryptography and found that anagrams are very useful. Two strings are anagrams of each other if they have same character set and same length. For example strings "bacdc" and "dcbac" are anagrams, while strings "bacdc" and "dcbad" are not.

Alice decides on an encryption scheme involving 2 large strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. She need your help in finding out this number.

Given two strings (they can be of same or different length) help her in finding out the minimum number of character deletions required to make two strings anagrams. Any characters can be deleted from any of the strings.

Input Format 
Two lines each containing a string.

Constraints 
1 <= Length of A,B <= 10000 
A and B will only consist of lowercase latin letter.

Output Format 
A single integer which is the number of character deletions.

Sample Input #00:

cde
abc
Sample Output #00:

4
Explanation #00: 
We need to delete 4 characters to make both strings anagram i.e. 'd' and 'e' from first string and 'b' and 'a' from second string.*/

public class MakeItAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string1 = sc.nextLine();
		String string2 = sc.nextLine();
		System.out.println(makeItAnagram(string1, string2));
	}

	/**
	 * @param string1 
	 * @param string2
	 * @return count of minimum deletions of letters needed to make string1 anagram of string2
	 */
	private static int makeItAnagram(String string1, String string2) {
		int[] countOfLetters1 = getCount(string1);
		int[] countOfLetters2 = getCount(string2);
		return (getMinimumDeletions(countOfLetters1, countOfLetters2));
	}

	/**
	 * Auxillary method to count the minimum deletions of letters required to make the count of letters same in two strings given.
	 * @param countOfLetters1
	 * @param countOfLetters2
	 * @return
	 */
	private static int getMinimumDeletions(int[] countOfLetters1, int[] countOfLetters2) {
		int deletions = 0;
		for(int i = 0 ; i < 26; i++){
			deletions += (Math.max(countOfLetters1[i], countOfLetters2[i]) - Math.min(countOfLetters1[i], countOfLetters2[i]));
		}
		return deletions;
	}

	/**
	 * Take a string and returns the count of each letters "a-z" in an int array a starting at 0th position.
	 * @param string1
	 * @return
	 */
	private static int[] getCount(String string1) {
		int[] countOfLetters = new int[26];
		char[] giveChars = string1.toCharArray();
		for(int i = 0 ; i < giveChars.length ; i++){
			countOfLetters[giveChars[i]-'a']++;
		}
		return countOfLetters;
	}

}
