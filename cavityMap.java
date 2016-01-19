/*You are given a square map of size n×n. Each cell of the map has a value denoting its depth. We will call a cell of the map a cavity if and only if this cell is not on the border of the map and each cell adjacent to it has strictly smaller depth. Two cells are adjacent if they have a common side (edge).

You need to find all the cavities on the map and depict them with the uppercase character X.

Input Format

The first line contains an integer, n, denoting the size of the map. Each of the following n lines contains n positive digits without spaces. Each digit (1-9) denotes the depth of the appropriate area.

Constraints 
1≤n≤100
Output Format

Output n lines, denoting the resulting map. Each cavity should be replaced with character X.

Sample Input

4
1112
1912
1892
1234
Sample Output

1112
1X12
18X2
1234
Explanation

The two cells with the depth of 9 fulfill all the conditions of the Cavity definition and have been replaced by X.

*/
import java.util.Scanner;

public class cavityMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.nextLine();
		char[][] matrix = new char[size][size];
		for(int i = 0; i < size; i++){
			String s = sc.nextLine();
			char[] charArr = s.toCharArray();
			for(int j = 0; j < size; j++){
				matrix[i][j] = charArr[j];
			}
		}
		markCavities(matrix);
				

	}

	private static void markCavities(char[][] matrix) {
		for(int i = 0; i < matrix.length; i++){
			for(int j= 0; j < matrix.length; j++){
				if(i > 0 && j > 0 && i < matrix.length-1 && j < matrix.length-1){
					System.out.print((isCavity(matrix, i, j) ? 'X': matrix[i][j]));
				}else{
					System.out.print(matrix[i][j]);
				}
			}
			System.out.println();
		}
		
	}

	private static boolean isCavity(char[][] matrix, int i, int j) {
		if(		matrix[i][j] > matrix[i-1][j] 
				&& matrix[i][j] > matrix[i][j-1] 
				&& matrix[i][j] > matrix[i+1][j]
				&& matrix[i][j] > matrix[i][j+1]){
			return true;
		}
		return false;
	}

}
