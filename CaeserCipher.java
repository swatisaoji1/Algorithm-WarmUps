import java.util.Scanner;

public class CaeserCipher {

	public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
			sc.nextLine();
			String given = sc.next();
			char[] thisstring = given.toCharArray();
			int code = sc.nextInt();
			for(int i = 0; i < thisstring.length; i++){
				char c = thisstring[i];
				if(Character.isAlphabetic(c)){
					char offset = Character.isUpperCase(c)?'A':'a';
					thisstring[i]= Character.toChars(offset +(c - offset + code) % 26)[0];
				}
				
			}
			System.out.println(thisstring);
			sc.close();
	}

}
