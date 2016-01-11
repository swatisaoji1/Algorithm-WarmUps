import java.util.Scanner;

public class CutSticks {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            numbers[i] = sc.nextInt();  
            if(numbers[i] > 0 && numbers[i] < min){
                min = numbers[i];
            }   
        }
        cutSticks(numbers, min);
        
    }

	private static void cutSticks(int[] numbers, int min) {
		// TODO Auto-generated method stub
		int length = numbers.length;
		
		while(min < Integer.MAX_VALUE){
			length = 0;
			int newMin = Integer.MAX_VALUE;
			for(int i = 0; i < numbers.length; i++){
				if(numbers[i] > 0){
					length += 1;
					numbers[i] = numbers[i] - min;
				}
				if(numbers[i] > 0 && numbers[i] < newMin){
					newMin = numbers[i];
				}
			}
			System.out.println(length);
			min = newMin;
		}
		
	}

}
