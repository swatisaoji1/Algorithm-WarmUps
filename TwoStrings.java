import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*Input Format

The first line consists of an integer, N, the number of rocks. 
Each of the next N lines contains a rock's composition. Each composition consists of lower-case letters of English alphabet.

Constraints 
1≤N≤100 
Each composition consists of only lower-case Latin letters ('a'-'z'). 
1≤ length of each composition ≤100
Output Format

Print the number of gem-elements that are common in these rocks. If there are none, print 0.

Sample Input

3
abcdde
baccd
eeabg
Sample Output

2
Explanation

Only "a" and "b" are the two kinds of gem-elements, since these are the only characters that occur in every rock's composition.
*/


public class TwoStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfStr = sc.nextInt();
		sc.nextLine(); // discard the empty line 
		System.out.println(checkCommonGems(sc, noOfStr));

	}

	private static int checkCommonGems(Scanner sc, int noOfStr) {
		int[] letters = new int[26];
		for(int i = 0 ; i < noOfStr; i++){
			String s1 = sc.nextLine();
			char[] c = s1.toCharArray();
			// count unique letters
			Set<Character> uniqueLetters = new HashSet<Character>();
			for(int j = 0 ; j < c.length; j++){
				if(uniqueLetters.add(c[j])){
					letters[c[j]-97] += 1;
				}	
			}
		}
		int count = 0;
		for(int i = 0; i < letters.length; i++ ){
			if(letters[i] == noOfStr){
				count+= 1;
			}
		}
		
		return count;
		
	}

}
