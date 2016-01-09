import java.util.Scanner;

public class DecentNo {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int cases = sc.nextInt();
       for(int i = 0; i < cases; i++){
          int n = sc.nextInt();
         getLargestDecentNo(n);
        }
    }

	private static void getLargestDecentNo(int n) {
		int noOfThrees = getThrees(n);
		if(noOfThrees == -1){
			System.out.println("-1");
		}else{
			makeNumber(n, noOfThrees);
		}
		
		
	}

	private static void makeNumber(int n, int noOfThrees) {
		int noOfFive = n - noOfThrees;
		for(int i = 0; i < noOfFive; i++){
			System.out.print('5');
		}
		
		for(int i = 0; i < noOfThrees; i++){
			System.out.print('3');
		}		
		System.out.println();
	}

	private static int getThrees(int n) {
		int noOf3 = -1;
		if(n > 0 && n%5==0){
			noOf3 = 5*(n/5);
		}
		for(int i =0 ; i < n; i=i+5){
			int check = (n-i) % 3 ;
			if(check == 0 && ((check % 5)==0)){
				noOf3 = i;
				break;	
			}	
		}
		return noOf3;
	}

}
