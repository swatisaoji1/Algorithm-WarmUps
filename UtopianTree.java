import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int i = 0; i < cases; i++){
			int cycles = sc.nextInt();
			System.out.println(calcHeight(cycles, 1));
		}

	}

	private static int calcHeight(int cycles, int h) {
		int height = h;
		for(int i = 0; i < cycles; i++){
			if(i%2==0){
				height=height*2;
			}else{
				height++;
			}
		}
		return height;
	}

}
