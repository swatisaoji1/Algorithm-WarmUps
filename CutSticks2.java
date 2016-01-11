import java.util.ArrayList;
import java.util.Scanner;

public class CutSticks2 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>(n);
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
        	numbers.add(sc.nextInt());  
            if(numbers.get(i) > 0 && numbers.get(i) < min){
                min = numbers.get(i);
            }   
        }
        cutSticks(numbers, min);
        
    }

	private static void cutSticks(ArrayList<Integer> numbers, int min) {
		// TODO Auto-generated method stub
		int length = numbers.size();
		
		while(min < Integer.MAX_VALUE){
			System.out.println(numbers.size());
			int newMin = Integer.MAX_VALUE;
			for(int i = 0; i < numbers.size(); i++){
				int newno = numbers.get(i) - min;
				if(newno > 0){
					numbers.set(i, numbers.get(i) - min);
					if(newno < newMin){
						newMin = newno;
					}
				}else{
					numbers.remove(i);
					i--;
				}				
			}
			min = newMin;
		}
		
	}

}
