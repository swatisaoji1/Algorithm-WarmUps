import java.util.Scanner;

public class DivisibleByDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int i = 0; i < cases; i++){
			long number = sc.nextLong();
			System.out.println(evenlyDivisible(number));
		}


	}

	private static long evenlyDivisible(long number) {
		long count =0;
		long n = number;
		while(number > 0){
			long digit = number%10;
			if(digit != 0 && n%digit == 0){
				count++;
			}
			number/=10;
		}
		return count;
	}

}
