import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String ampm = time.substring(time.length()-2, time.length());
        System.out.println(get24HoursFormat(time, ampm));   
	}

	private static String get24HoursFormat(String time, String ampm) {
		time = time.substring(0, time.length()-2);
		String h = time.substring(0, 2);
		int hours  = Integer.parseInt(h);
		if(ampm.toLowerCase().equals("pm") && hours!= 12){
			hours = hours+12;
		}
		if(ampm.toLowerCase().equals("am") && hours == 12){
			hours = 0;
		}
		
		String newTime = time.replace(h, String.format("%02d", hours));
		return newTime;
	}

}
