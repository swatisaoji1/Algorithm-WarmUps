/*Problem Statement

Watson gives two integers (A and B) to Sherlock and asks if he can count the number of square integers between A and B (both inclusive).

Note: A square integer is an integer which is the square of any integer. For example, 1, 4, 9, and 16 are some of the square integers as they are squares of 1, 2, 3, and 4, respectively.

Input Format 
The first line contains T, the number of test cases. T test cases follow, each in a new line. 
Each test case contains two space-separated integers denoting A and B.

Output Format 
For each test case, print the required answer in a new line.

Constraints 
1≤T≤100 
1≤A≤B≤109

Sample Input

2
3 9
17 24
Sample output

2
0

*/

import java.util.Scanner;

public class CountSquares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int i = 0; i < cases; i++){
			int number1 = sc.nextInt();
			int number2 = sc.nextInt();
			System.out.println(findSquares2(number1, number2));
		}

	}

	/* Complexity O(1)*/
	private static int findSquares2(int number1, int number2) {
		int begin = (int) Math.ceil(Math.sqrt(number1));
		int end = (int) Math.floor(Math.sqrt(number2));
		return end - begin + 1;
	}

	/*Complexity O(log (n2 - n1)) */
	private static int findSquares(int number1, int number2) {
		int count = 0;
		int begin = (int)Math.sqrt(number1);
		if (begin * begin == number1){ count = 1; }
		for(int i = begin + 1 ; i*i <= number2; i++ ){
				count++;
		}
		return count;
	}

}
