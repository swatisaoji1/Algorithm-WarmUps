import java.util.Scanner;

public class Chocolate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases  = sc.nextInt();
		for(int i = 0; i < cases; i++){
			int money = sc.nextInt();
			int cost = sc.nextInt();
			int wrappers = sc.nextInt();
			System.out.println(getChocolates(money, cost, wrappers));
			
		}

	}

	private static int getChocolates(int money, int cost, int wrappers) {
		int chocBought = money/cost;
		int totalchocolates = chocBought;
		int remainingChocs = 0;
		while(chocBought + remainingChocs >= wrappers){
			int chocolates = chocBought + remainingChocs;
			chocBought = chocolates/wrappers;
			remainingChocs= chocolates % wrappers;
			totalchocolates += chocBought;
		}		
		return totalchocolates;
	}

}
